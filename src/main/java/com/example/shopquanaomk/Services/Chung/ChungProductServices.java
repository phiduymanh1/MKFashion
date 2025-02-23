package com.example.shopquanaomk.Services.Chung;

import com.example.shopquanaomk.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ChungProductServices {
    private final ProductRepository productRepository;

    public ChungProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
