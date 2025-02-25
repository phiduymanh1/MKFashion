package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Config.ModelMapperConfig;
import com.example.shopquanaomk.Dto.ResponDto.ColorDtoReponse;
import com.example.shopquanaomk.Entity.Color;
import com.example.shopquanaomk.Repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminColorServices {
    private final ColorRepository colorRepository;
    @Autowired
    private ModelMapperConfig modelMapperConfig;

    public AdminColorServices(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }
    public List<ColorDtoReponse>getAll(){
        return colorRepository.findAll().stream().map(color -> modelMapperConfig.modelMapper().map(color,ColorDtoReponse.class)).collect(Collectors.toUnmodifiableList());
    }
}
