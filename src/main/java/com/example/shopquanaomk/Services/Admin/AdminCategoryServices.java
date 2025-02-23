package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Entity.Category;
import com.example.shopquanaomk.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminCategoryServices {
    private final CategoryRepository categoryRepository;

    public AdminCategoryServices(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
