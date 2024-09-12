package com.example.backend.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // In a real-world app, you'd load the user from the database
        if ("testuser".equals(username)) {
            return new User("testuser", "password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }

    public String getHardcodedUser() {
        return "testuser";
    }

    public String getHardcodedPassword() {
        return "password";
    }
}
