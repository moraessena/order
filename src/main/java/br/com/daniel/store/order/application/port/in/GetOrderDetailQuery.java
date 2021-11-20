package br.com.daniel.store.order.application.port.in;

import br.com.daniel.store.order.domain.Order;

public interface GetOrderDetailQuery {

    Order getOrderDetail(String id);

}
