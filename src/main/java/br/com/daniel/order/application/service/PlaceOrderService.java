package br.com.daniel.order.application.service;

import br.com.daniel.order.application.port.in.PlaceOrderCommand;
import br.com.daniel.order.application.port.in.PlaceOrderUseCase;
import br.com.daniel.order.application.port.out.LoadProductPort;
import br.com.daniel.order.application.port.out.SaveOrderPort;
import br.com.daniel.order.domain.Customer;
import br.com.daniel.order.domain.Order;
import br.com.daniel.order.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
@RequiredArgsConstructor
public class PlaceOrderService implements PlaceOrderUseCase {

    private final SaveOrderPort saveOrderPort;
    private final LoadProductPort loadProductPort;

    @Override
    public Order placeOrder(PlaceOrderCommand command) throws Exception {
        List<Product> products = command.getProductIds().stream().map(id -> {
            Product product = loadProductPort.loadProduct(id);
            if (product == null) {
                throw new RuntimeException("Invalid product");
            }
            return product;
        }).collect(toList());
        Customer customer = Customer.builder()
                .name(command.getCustomerName())
                .email(command.getCustomerEmail())
                .govId(command.getCustomerGovId())
                .build();
        Order order = Order.builder()
                .customer(customer)
                .products(products)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        return saveOrderPort.saveOrder(order);
    }
}
