package com.github.blackadm.security.modules.product.controllers;

import com.github.blackadm.security.modules.product.entities.Product;
import com.github.blackadm.security.modules.product.services.CreateProductService;
import com.github.blackadm.security.modules.product.services.ListProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ListProductService listProductService;

    @Autowired
    CreateProductService createProductService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Product> list() {
        return listProductService.listAll();
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(createProductService.create(product));
    }
}
