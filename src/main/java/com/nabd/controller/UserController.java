package com.nabd.controller;

import com.nabd.model.User;
import com.nabd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> all() { return userService.getAll(); }

    @PostMapping
    public User create(@RequestBody User u) { return userService.create(u); }
}
