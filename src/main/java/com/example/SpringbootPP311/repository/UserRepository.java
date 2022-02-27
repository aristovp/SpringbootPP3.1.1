package com.example.SpringbootPP311.repository;

import com.example.SpringbootPP311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
