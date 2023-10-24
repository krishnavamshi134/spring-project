package com.springdemo.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.example.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    Users findByName(String name);
}

