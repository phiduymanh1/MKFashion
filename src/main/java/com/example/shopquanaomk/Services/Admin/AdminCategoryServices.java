package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Config.ModelMapper.ModelMapperConfig;
import com.example.shopquanaomk.Dto.ResponDto.CategoryDtoResponse;
import com.example.shopquanaomk.Entity.Category;
import com.example.shopquanaomk.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminCategoryServices {
    private final CategoryRepository categoryRepository;
    private final ModelMapperConfig modelMapperConfig;

    public AdminCategoryServices(CategoryRepository categoryRepository, ModelMapperConfig modelMapperConfig) {
        this.categoryRepository = categoryRepository;
        this.modelMapperConfig=modelMapperConfig;
    }

    public List<CategoryDtoResponse> getALl() {
        return categoryRepository.findAll().stream().map(n->convertDto(n)).collect(Collectors.toUnmodifiableList());
    }
    public CategoryDtoResponse convertDto(Category category){
        return modelMapperConfig.modelMapper().map(category,CategoryDtoResponse.class);
    }
}
