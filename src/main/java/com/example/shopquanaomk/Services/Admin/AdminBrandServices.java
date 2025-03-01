package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Config.ModelMapper.ModelMapperConfig;
import com.example.shopquanaomk.Dto.ResponDto.BrandDtoResponse;
import com.example.shopquanaomk.Repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminBrandServices {
    private final BrandRepository brandRepository;

    private final ModelMapperConfig modelMapperConfig;

    public AdminBrandServices(BrandRepository brandRepository, ModelMapperConfig modelMapperConfig) {
        this.brandRepository = brandRepository;
        this.modelMapperConfig = modelMapperConfig;
    }

    public List<BrandDtoResponse> getAll() {
        return brandRepository.findAll().stream().map(n->modelMapperConfig.modelMapper().map(n,BrandDtoResponse.class)).collect(Collectors.toUnmodifiableList());
    }
}
