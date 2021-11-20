package br.com.daniel.order.adapter.out.persistence;

import br.com.daniel.order.domain.Customer;
import br.com.daniel.order.domain.Order;
import br.com.daniel.order.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class OrderMapper {

    public Order orderDocumentToOrder(OrderDocument document) {
        List<Product> products = document.getProducts().stream().map(this::productDocumentToProduct).collect(Collectors.toList());
        return Order.builder()
                .id(document.getId())
                .customer(customerDocumentToCustomer(document.getCustomer()))
                .products(products)
                .createdAt(document.getCreatedAt())
                .updatedAt(document.getUpdatedAt())
                .build();
    }

    public Product productDocumentToProduct(ProductDocument document) {
        return Product.builder()
                .id(document.getId())
                .description(document.getDescription())
                .price(document.getPrice())
                .build();
    }

    public Customer customerDocumentToCustomer(CustomerDocument document) {
        return Customer.builder()
                .email(document.getEmail())
                .name(document.getName())
                .build();
    }

}
