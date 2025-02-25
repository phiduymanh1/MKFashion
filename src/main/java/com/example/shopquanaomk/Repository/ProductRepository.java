package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p " +
            "JOIN FETCH p.color " +
            "JOIN FETCH p.brand " +
            "JOIN FETCH p.size")
    Page<Product> findAllWithDetails(Pageable pageable);

}
