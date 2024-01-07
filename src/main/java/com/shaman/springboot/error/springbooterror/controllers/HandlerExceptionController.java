package com.shaman.springboot.error.springbooterror.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.shaman.springboot.error.springbooterror.exceptions.userNotFoundException;
import com.shaman.springboot.error.springbooterror.models.Error;

@ControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionByZero(Exception ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error division por cero");
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        //return ResponseEntity.internalServerError().body(error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundEx(NoHandlerFoundException ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error division por cero");
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(404).body(error);
    }

    //----------------------------------------------------------------
    //alternativa a ResponseEntity
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Map<String, Object>> numberFormat(Exception e){
        Map<String , Object> error = new HashMap<>();
        error.put("date" , new Date().toString());
        error.put("error" , "numero invalido");
        error.put("message" , e.getMessage());
        error.put("status" , HttpStatus.INTERNAL_SERVER_ERROR.value());
         return ResponseEntity.status(404).body(error);
        
    }


    @ExceptionHandler({ NullPointerException.class ,
                        HttpMessageNotWritableException.class, 
                        userNotFoundException.class } )
    public ResponseEntity<Map<String, Object>> userNotFound(Exception e){
        Map<String , Object> error = new HashMap<>();
        error.put("date" , new Date().toString());
        error.put("error" , "el usuario no existe");
        error.put("message" , e.getMessage());
        error.put("status" , HttpStatus.INTERNAL_SERVER_ERROR.value());
         return ResponseEntity.status(404).body(error);
        
    }

}
