package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Entity.Brand;
import com.example.shopquanaomk.Repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBrandServices {
    private final BrandRepository brandRepository;

    public AdminBrandServices(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }
}
