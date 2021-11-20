package br.com.daniel.order.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id"})
public class Order {

    @Id
    public String id;

    public Customer customer;
    public List<Product> products;

    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;


}
