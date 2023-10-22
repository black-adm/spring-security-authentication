package com.github.blackadm.security.modules.product.repositories;

import com.github.blackadm.security.modules.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Product findBySku(String sku);
}
