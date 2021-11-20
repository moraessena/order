package br.com.daniel.order.application.port.in;

import br.com.daniel.order.domain.Order;

public interface GetOrderDetailQuery {

    Order getOrderDetail(String id);

}
