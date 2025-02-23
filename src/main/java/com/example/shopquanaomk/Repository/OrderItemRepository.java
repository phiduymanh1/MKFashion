package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
