package br.com.daniel.store.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "description"})
public class ProductDocument {

    private String id;
    private String description;
    private Double price;

}
