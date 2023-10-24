package com.springdemo.example.controller;

import com.springdemo.example.entity.Users;
import com.springdemo.example.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UsersService service;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user) {
        return service.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<Users> addUsers(@RequestBody List<Users> users) {
        return service.saveUsers(users);
    }

    @GetMapping("/users")
    public List<Users> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/userById/{id}")
    public Users findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping("/user/{name}")
    public Users findUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }

    @PutMapping("/update")
    public Users updateUser(@RequestBody Users user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}
