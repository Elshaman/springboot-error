package com.shaman.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.shaman.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    Optional<User> findUserById(Long Id);
    List<User> findAll();
} 