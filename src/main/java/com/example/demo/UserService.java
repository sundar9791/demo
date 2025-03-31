package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
    public User getUserById(int id) {
        return userMapper.findById(id);
    }
    public void addUser(User user) {
        userMapper.insert(user);
    }
    public void updateUser(User user) {
        userMapper.update(user);
    }
    public void deleteUser(int id) {
        userMapper.delete(id);
    }
}
