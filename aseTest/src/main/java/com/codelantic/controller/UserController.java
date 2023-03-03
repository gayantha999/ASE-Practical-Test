package com.codelantic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.codelantic.Repository.UserRepository;
import com.codelantic.entity.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }



}
