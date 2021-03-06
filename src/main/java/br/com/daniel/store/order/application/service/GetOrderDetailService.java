package br.com.daniel.store.order.application.service;

import br.com.daniel.store.order.application.port.in.GetOrderDetailQuery;
import br.com.daniel.store.order.application.port.out.LoadOrderPort;
import br.com.daniel.store.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetOrderDetailService implements GetOrderDetailQuery {

    private final LoadOrderPort loadOrderPort;

    @Override
    public Order getOrderDetail(String id) {
        return loadOrderPort.loadOrder(id);
    }
}
