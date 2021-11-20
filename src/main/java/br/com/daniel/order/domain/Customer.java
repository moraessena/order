package br.com.daniel.order.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"name", "email"})
public class Customer {

    private String name;
    private String email;
    private String govId;

}
