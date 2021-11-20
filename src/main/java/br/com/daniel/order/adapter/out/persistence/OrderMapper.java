package br.com.daniel.order.adapter.out.persistence;

import br.com.daniel.order.domain.Customer;
import br.com.daniel.order.domain.Order;
import br.com.daniel.order.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
class OrderMapper {

    public Order orderDocumentToOrder(OrderDocument document) {
        List<Product> products = document.getProducts().stream().map(this::productDocumentToProduct).collect(toList());
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

    public OrderDocument orderToOrderDocument(Order order) {
        List<ProductDocument> products = order.getProducts().stream().map(this::productToProductDocument).collect(toList());
        return new OrderDocument(
                order.getId(),
                customerToCustomerDocument(order.getCustomer()),
                products,
                order.getCreatedAt(),
                order.getUpdatedAt()
        );
    }

    public CustomerDocument customerToCustomerDocument(Customer customer) {
        return new CustomerDocument(
                customer.getName(),
                customer.getEmail(),
                customer.getGovId()
        );
    }

    public ProductDocument productToProductDocument(Product product) {
        return new ProductDocument(
                product.getId(),
                product.getDescription(),
                product.getPrice());
    }

}
