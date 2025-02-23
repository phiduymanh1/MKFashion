package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
