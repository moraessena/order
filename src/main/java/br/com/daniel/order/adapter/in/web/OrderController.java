package br.com.daniel.order.adapter.in.web;

import br.com.daniel.order.application.port.in.GetOrderDetailQuery;
import br.com.daniel.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
class OrderController {

    private final GetOrderDetailQuery getOrderDetailQuery;

    @GetMapping("/{id}")
    Order getOrderDetail(@PathVariable("id") String id) {
        return getOrderDetailQuery.getOrderDetail(id);
    }

}
