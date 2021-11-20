package br.com.daniel.order.adapter.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrderRepository extends MongoRepository<Order, String> {
}
