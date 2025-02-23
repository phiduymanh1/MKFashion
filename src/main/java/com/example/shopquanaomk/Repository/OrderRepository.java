package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
