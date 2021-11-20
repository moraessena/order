package br.com.daniel.order.domain;


import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id"})
public class Order {

    public String id;

    public Customer customer;
    public List<Product> products;

    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

}
