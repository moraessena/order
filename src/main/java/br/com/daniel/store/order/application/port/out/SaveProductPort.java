package br.com.daniel.store.order.application.port.out;

import br.com.daniel.store.order.domain.Product;

@FunctionalInterface
public interface SaveProductPort {
    Product saveProduct(Product product);
}
