package br.com.daniel.order.application.port.out;

import br.com.daniel.order.domain.Product;

public interface LoadProductPort {

    Product loadProduct(String id);

}
