package com.example.shopquanaomk.Services.Common;

import com.example.shopquanaomk.Dto.ResponDto.OrderDtoResponse;
import com.example.shopquanaomk.Entity.Order;
import com.example.shopquanaomk.Repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CommonOrderServices {
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    public CommonOrderServices(OrderRepository orderRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
    }
    public OrderDtoResponse convertToDTO(Order order) {
        return modelMapper.map(order, OrderDtoResponse.class);
    }
    public OrderDtoResponse detail(Integer id) {
         Order order =  orderRepository.findById(id).orElseThrow();
         OrderDtoResponse orderDtoResponse = convertToDTO(order);
         return orderDtoResponse;
    }


}
