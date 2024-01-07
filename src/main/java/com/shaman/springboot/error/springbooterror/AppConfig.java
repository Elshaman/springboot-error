package com.shaman.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shaman.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L , "Valentina", "Aristizabal"));
        users.add( new User(2L , "Yessi", "Chaverra"));
        users.add(new User(3L , "Ariz", "lepe"));

        return users;   
    }
}
