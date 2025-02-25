package com.example.shopquanaomk.Config;

import com.example.shopquanaomk.Dto.ResponDto.OrderDtoResponse;
import com.example.shopquanaomk.Entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(Order.class, OrderDtoResponse.class)
                .addMappings(mapper ->{
                    mapper.map(orderNho -> orderNho.getUser().getFullName(), OrderDtoResponse::setFullName);

                });

        return modelMapper;
    }


}
