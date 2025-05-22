package com.example.angkringan_99.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, String> users = new HashMap<>();
    
    
    public UserService() {
        
        users.put("admin", "admin");
    }
    
    public boolean login(String username, String password) {
        
        if (users.containsKey(username)) {
            return users.get(username).equals(password);
        }
        return false;
    }
    
    public boolean register(String username, String password) {
        
        if (users.containsKey(username)) {
            return false;
        }
        
        users.put(username, password);
        return true;
    }
}