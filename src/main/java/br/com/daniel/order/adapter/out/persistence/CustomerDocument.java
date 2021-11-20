package br.com.daniel.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("customer")
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"name", "email"})
public class CustomerDocument {

    private String name;
    private String email;
    private String govId;

}
