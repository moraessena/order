package br.com.daniel.store.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"name", "email"})
public class CustomerDocument {

    private String name;
    private String email;
    private String govId;

}
