package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Config.ModelMapperConfig;
import com.example.shopquanaomk.Dto.ResponDto.ProductDtoResponse;
import com.example.shopquanaomk.Entity.Product;
import com.example.shopquanaomk.Repository.ProductRepository;
import com.example.shopquanaomk.Services.uploadfile.impl.UploadImageFile;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AdminProductServices {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    private final ModelMapperConfig modelMapperConfig;

    private UploadImageFile uploadImageFile;

    public AdminProductServices(ProductRepository productRepository, ModelMapper modelMapper, ModelMapperConfig modelMapperConfig,UploadImageFile uploadImageFile) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
        this.modelMapperConfig = modelMapperConfig;
        this.uploadImageFile=uploadImageFile;
    }


    public Page<ProductDtoResponse> getAll(int page,int size){
        Pageable pageable= PageRequest.of(page,size, Sort.by(Sort.Direction.DESC,"id"));
        return productRepository.findAll(pageable).map(pro->convertToDTO(pro));

    }


    public ProductDtoResponse save(Product product,MultipartFile file) {
        try {
            String url= uploadImageFile.uploadImage(file);
            product.setImageUrl(url);
            productRepository.save(product);

        } catch (Exception e) {
            throw new RuntimeException("Lỗi lưu sản phẩm cu ơi " + e.getMessage());

        }
        return convertToDTO(product);
    }



    public ProductDtoResponse convertToDTO(Product product) {
        ProductDtoResponse productDtoResponse=new ProductDtoResponse();
        productDtoResponse.setId(product.getId());
        productDtoResponse.setBrandName(product.getBrand().getName());
        productDtoResponse.setColorName(product.getColor().getName());
        productDtoResponse.setName(product.getName());
        productDtoResponse.setPrice(product.getPrice());
        productDtoResponse.setDescription(product.getDescription());
        productDtoResponse.setStock(product.getStock());
        productDtoResponse.setSizeName(product.getSize().getName());
        productDtoResponse.setNameCategory(product.getCategory().getName());
        productDtoResponse.setImageUrl(product.getImageUrl());
        return productDtoResponse;
    }
}
