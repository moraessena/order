package br.com.daniel.order.application.port.out;

import br.com.daniel.order.domain.Order;

public interface SaveOrderPort {
    Order saveOrder(Order order);
}
