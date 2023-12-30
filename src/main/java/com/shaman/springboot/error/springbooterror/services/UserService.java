package com.shaman.springboot.error.springbooterror.services;

import java.util.List;

import com.shaman.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    User findUserById(Long Id);
    List<User> findAll();
} 