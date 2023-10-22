package com.github.blackadm.security.modules.product.services;

import com.github.blackadm.security.modules.product.entities.Product;
import com.github.blackadm.security.modules.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }
}
