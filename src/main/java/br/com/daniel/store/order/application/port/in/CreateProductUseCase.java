package br.com.daniel.store.order.application.port.in;

import br.com.daniel.store.order.domain.Product;

@FunctionalInterface
public interface CreateProductUseCase {

    Product createProduct(CreateProductCommand command);

}
