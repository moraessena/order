package br.com.daniel.store.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "description"})
public class ProductDocument {

    @Field("id")
    private String id;
    private String description;
    private Double price;

}
