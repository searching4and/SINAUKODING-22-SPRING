package com.farhankoding.tokofarhan.repository;

import com.farhankoding.tokofarhan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}