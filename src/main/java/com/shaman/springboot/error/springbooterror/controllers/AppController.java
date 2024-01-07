package com.shaman.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.shaman.springboot.error.springbooterror.exceptions.userNotFoundException;
import com.shaman.springboot.error.springbooterror.models.domain.User;
import com.shaman.springboot.error.springbooterror.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(){
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("show/{id}")
    public User show(@PathVariable(name="id") Long id) {
        User user =  userService.findUserById(id).orElseThrow(()-> 
                                new  userNotFoundException("error el usuario no existe"));
        // if(user == null){
        //     throw new userNotFoundException();
        // }
        System.out.println(user.getLastName());
        return user;

    }
    



}
