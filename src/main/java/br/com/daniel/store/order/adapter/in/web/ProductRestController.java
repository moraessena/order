package br.com.daniel.store.order.adapter.in.web;

import br.com.daniel.store.order.application.port.in.CreateProductCommand;
import br.com.daniel.store.order.application.port.in.CreateProductUseCase;
import br.com.daniel.store.order.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductRestController {

    private CreateProductUseCase createProductUseCase;

    @PostMapping
    Product createProduct(@RequestBody CreateProductCommand command) {
        return createProductUseCase.createProduct(command);
    }

}
