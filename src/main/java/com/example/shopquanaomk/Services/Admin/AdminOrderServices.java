package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Dto.ResponDto.OrderDtoResponse;
import com.example.shopquanaomk.Entity.Order;
import com.example.shopquanaomk.Repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminOrderServices {
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    public AdminOrderServices(OrderRepository orderRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
    }

    public List<OrderDtoResponse> findAll() {
        return orderRepository.findAll()
                .stream()
                .map(this::convertToDTO) // Gọi hàm convertToDTO cho từng phần tử
                .toList(); // Chuyển stream thành List
    }

    public OrderDtoResponse convertToDTO(Order order) {
        return modelMapper.map(order, OrderDtoResponse.class);
    }
}
