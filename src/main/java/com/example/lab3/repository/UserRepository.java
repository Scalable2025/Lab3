package com.example.lab3.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab3.model.User;

public interface UserRepository extends JpaRepository<User,UUID> {

}
