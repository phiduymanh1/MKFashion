package com.example.shopquanaomk.Services.Common;

import com.example.shopquanaomk.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CommonProductServices {
    private final ProductRepository productRepository;

    public CommonProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
