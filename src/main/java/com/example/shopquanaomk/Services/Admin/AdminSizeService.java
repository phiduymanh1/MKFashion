package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Config.ModelMapper.ModelMapperConfig;
import com.example.shopquanaomk.Dto.ResponDto.SizeDtoResponse;
import com.example.shopquanaomk.Repository.SizeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class AdminSizeService {

    private  ModelMapperConfig modelMapperConfig;


    private  SizeRepository sizeRepository;

    public AdminSizeService(SizeRepository sizeRepository,ModelMapperConfig modelMapperConfig) {
        this.sizeRepository = sizeRepository;
        this.modelMapperConfig = modelMapperConfig;
    }

    public List<SizeDtoResponse> getAll(){
        return sizeRepository.findAll().stream().map(n->modelMapperConfig.modelMapper().map(n,SizeDtoResponse.class)).collect(Collectors.toUnmodifiableList());
    }
}
