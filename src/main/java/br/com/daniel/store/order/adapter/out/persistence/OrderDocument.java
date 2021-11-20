package br.com.daniel.store.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("order")
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id"})
public class OrderDocument {

    @Id
    public String id;

    public CustomerDocument customer;
    public List<ProductDocument> products;

    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;


}
