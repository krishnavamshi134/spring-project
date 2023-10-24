package com.springdemo.example.service;

import com.springdemo.example.entity.Users;
import com.springdemo.example.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repository;

    public Users saveUser(Users user) {
        return repository.save(user);
    }

    public List<Users> saveUsers(List<Users> users) {
        return repository.saveAll(users);
    }

    public List<Users> getUsers() {
        return repository.findAll();
    }

    public Users getUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Users getUserByName(String name) {
        return repository.findByName(name);
    }

    public String deleteUser(int id) {
        repository.deleteById(id);
        return "user removed !! " + id;
    }

    public Users updateUser(Users user) {
        Users existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setGender(user.getGender());
        return repository.save(existingUser);
    }


}
