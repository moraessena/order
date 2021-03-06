package br.com.daniel.store.order.adapter.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrderRepository extends MongoRepository<OrderDocument, String> {
}
