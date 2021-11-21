package br.com.daniel.store.order.adapter.out.web;

import br.com.daniel.store.order.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "catalog", path = "/api")
interface ProductRestAdapter {

    @GetMapping(value = "/products/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    Product getProduct(@PathVariable("id") String id);

}
