package com.kt.rest.demoEcommerce.repository;

import com.kt.rest.demoEcommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
