package br.com.daniel.order.adapter.out.persistence;

import br.com.daniel.order.application.port.out.LoadOrderPort;
import br.com.daniel.order.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderPersistenceAdapter implements LoadOrderPort {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public Order loadOrder(String id) {
        OrderDocument document = orderRepository.findById(id).get();
        return orderMapper.orderDocumentToOrder(document);
    }
}
