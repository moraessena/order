package br.com.daniel.store.order.application.port.out;

import br.com.daniel.store.order.domain.Order;

public interface SaveOrderPort {
    Order saveOrder(Order order);
}
