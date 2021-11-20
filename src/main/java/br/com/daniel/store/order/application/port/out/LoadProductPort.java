package br.com.daniel.store.order.application.port.out;

import br.com.daniel.store.order.domain.Product;

public interface LoadProductPort {

    Product loadProduct(String id);

}
