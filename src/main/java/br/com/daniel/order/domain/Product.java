package br.com.daniel.order.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "description"})
public class Product {

    private String id;
    private String description;
    private Double price;

}
