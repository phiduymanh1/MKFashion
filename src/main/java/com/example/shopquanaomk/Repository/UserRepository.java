package com.example.shopquanaomk.Repository;

import com.example.shopquanaomk.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
