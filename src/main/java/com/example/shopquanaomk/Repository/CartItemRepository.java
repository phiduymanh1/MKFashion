package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
