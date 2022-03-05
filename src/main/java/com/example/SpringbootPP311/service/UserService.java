package com.example.SpringbootPP311.service;

import com.example.SpringbootPP311.model.User;

import java.util.List;

public interface UserService {
    User getByIdUser(Long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    void userUpdate(long id, User userUpdate);
}
