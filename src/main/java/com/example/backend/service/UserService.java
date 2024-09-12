package com.example.backend.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getHardcodedUser() {
        return "testuser";
    }

    public String getHardcodedPassword() {
        return "password";
    }
}
