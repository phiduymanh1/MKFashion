package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Repository.OrderItemRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminOrderItemServices {
    private final OrderItemRepository orderItemRepository;


    public AdminOrderItemServices(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


}
