package br.com.daniel.store.order.adapter.out.web;

import br.com.daniel.store.order.application.port.out.LoadProductPort;
import br.com.daniel.store.order.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductWebAdapter implements LoadProductPort {

    private final ProductRestAdapter productRestAdapter;

    @Override
    public Product loadProduct(String id) {
        return productRestAdapter.getProduct(id);
    }
}
