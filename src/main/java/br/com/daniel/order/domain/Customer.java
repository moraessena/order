package br.com.daniel.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"name", "email"})
public class Customer {

    private String name;
    private String email;
    private String govId;

}
