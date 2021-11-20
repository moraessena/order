package br.com.daniel.store.order.adapter.out.persistence;

import br.com.daniel.store.order.application.port.out.LoadProductPort;
import br.com.daniel.store.order.application.port.out.SaveProductPort;
import br.com.daniel.store.order.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements LoadProductPort, SaveProductPort {

    private final ProductRepository productRepository;
    private final OrderMapper orderMapper;

    @Override
    public Product loadProduct(String id) {
        ProductDocument productDocument = productRepository.findById(id).get();
        return orderMapper.productDocumentToProduct(productDocument);
    }

    @Override
    public Product saveProduct(Product product) {
        ProductDocument document = orderMapper.productToProductDocument(product);
        ProductDocument savedDocument = productRepository.save(document);
        product.setId(savedDocument.getId());
        return product;
    }
}
