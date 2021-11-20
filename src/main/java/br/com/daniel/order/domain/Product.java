package br.com.daniel.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "description"})
public class Product {

    private String id;
    private String description;
    private Double price;

}
