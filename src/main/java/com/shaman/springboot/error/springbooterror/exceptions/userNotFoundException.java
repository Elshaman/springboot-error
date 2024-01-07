package com.shaman.springboot.error.springbooterror.exceptions;

public class userNotFoundException extends RuntimeException {

    public userNotFoundException(String message) {
        super(message);
    }

}
