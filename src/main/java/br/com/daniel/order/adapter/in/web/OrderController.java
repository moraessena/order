package br.com.daniel.order.adapter.in.web;

import br.com.daniel.order.application.port.in.GetOrderDetailQuery;
import br.com.daniel.order.application.port.in.PlaceOrderCommand;
import br.com.daniel.order.application.port.in.PlaceOrderUseCase;
import br.com.daniel.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
class OrderController {

    private final GetOrderDetailQuery getOrderDetailQuery;
    private final PlaceOrderUseCase placeOrderUseCase;

    @GetMapping("/{id}")
    Order getOrderDetail(@PathVariable("id") String id) {
        return getOrderDetailQuery.getOrderDetail(id);
    }

    @PostMapping
    void placeOrder(@RequestBody PlaceOrderCommand command) throws Exception {
        placeOrderUseCase.placeOrder(command);
    }

}
