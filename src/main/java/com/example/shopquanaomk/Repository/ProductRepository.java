package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
