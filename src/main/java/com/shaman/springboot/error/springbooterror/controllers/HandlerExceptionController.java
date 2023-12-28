package com.shaman.springboot.error.springbooterror.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shaman.springboot.error.springbooterror.models.Error;

@ControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionByZero(Exception ex){
        return ResponseEntity.internalServerError().body("error division zero 500");
    }

}
