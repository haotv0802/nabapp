package com.product.nabsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by haoho on 7/9/20.
 */
@RestController
@RequestMapping(path = "/svc")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(@Qualifier("productRepository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping ("/product/list")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
