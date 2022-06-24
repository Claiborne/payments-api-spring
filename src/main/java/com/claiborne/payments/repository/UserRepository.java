package com.claiborne.payments.repository;

import com.claiborne.payments.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}