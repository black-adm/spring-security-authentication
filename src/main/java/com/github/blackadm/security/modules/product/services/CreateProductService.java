package com.github.blackadm.security.modules.product.services;

import com.github.blackadm.security.modules.product.entities.Product;
import com.github.blackadm.security.modules.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product product) {
        Optional<Product> existingProduct = Optional.ofNullable(productRepository.findBySku(product.getSku()));

        if (existingProduct.isPresent()) {
            throw new RuntimeException("Um produto com o mesmo SKU já existe no sistema.");
        }
        return productRepository.save(product);
    }
}
