package com.shaman.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaman.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private List<User> users;


    @Override
    public Optional<User> findUserById(Long Id) {
        Optional<User> user = users.stream().
                    filter(usr -> usr.getId().equals(Id)).
                    findFirst();
        // for (User u : users){
        //         if(u.getId().equals(Id)){   
        //             user = u;
        //             break;
        //         }
        // }

        return user;
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

}
