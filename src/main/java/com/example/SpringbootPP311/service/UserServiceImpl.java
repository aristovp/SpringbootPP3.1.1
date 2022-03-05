package com.example.SpringbootPP311.service;

import com.example.SpringbootPP311.model.User;
import com.example.SpringbootPP311.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getByIdUser(Long id) {
        return userRepository.getById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public void userUpdate(long id, User userUpdate) {
        User userUpd = getByIdUser(id);
        userUpd.setFirstName(userUpdate.getFirstName());
        userUpd.setLastName(userUpdate.getLastName());
        userUpd.setEmail(userUpdate.getEmail());
    }
}
