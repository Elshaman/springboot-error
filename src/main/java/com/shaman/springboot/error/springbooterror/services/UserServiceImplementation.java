package com.shaman.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shaman.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImplementation implements UserService {

    private List<User> users;


    public UserServiceImplementation() {
        this.users = new ArrayList<>();
        users.add(new User(1L , "Valentina", "Aristizabal"));
        users.add( new User(2L , "Yessi", "Chaverra"));
        users.add(new User(3L , "Ariz", "lepe"));

    }

    @Override
    public Optional<User> findUserById(Long Id) {
        User user = null;
        for (User u : users){
                if(u.getId().equals(Id)){   
                    user = u;
                    break;
                }
        }

        return Optional.ofNullable(null);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

}
