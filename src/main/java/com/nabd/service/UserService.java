package com.nabd.service;

import com.nabd.model.User;
import com.nabd.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() { return userRepository.findAll(); }
    public User create(User u) { return userRepository.save(u); }
}
