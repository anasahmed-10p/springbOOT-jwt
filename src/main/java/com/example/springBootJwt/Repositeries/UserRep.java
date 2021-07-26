package com.example.springBootJwt.Repositeries;

import com.example.springBootJwt.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRep extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String userName);
}
