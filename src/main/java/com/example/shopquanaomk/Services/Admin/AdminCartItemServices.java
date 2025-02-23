package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Entity.CartItem;
import com.example.shopquanaomk.Repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminCartItemServices {
    private final CartItemRepository cartItemRepository;

    public AdminCartItemServices(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }
    public List<CartItem> findAll() {
        return cartItemRepository.findAll();
    }
}
