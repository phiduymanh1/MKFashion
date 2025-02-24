package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Dto.ResponDto.ProductDtoResponse;
import com.example.shopquanaomk.Entity.Product;
import com.example.shopquanaomk.Repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminProductServices {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    public AdminProductServices(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }


    public ProductDtoResponse convertToDTO(Product product) {
        return modelMapper.map(product, ProductDtoResponse.class);
    }
}
