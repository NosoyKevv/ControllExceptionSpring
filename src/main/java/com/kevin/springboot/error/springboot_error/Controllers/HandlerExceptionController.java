package com.kevin.springboot.error.springboot_error.Controllers;

import com.kevin.springboot.error.springboot_error.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionByZero(Exception e) {
        return ResponseEntity.internalServerError().body("error 500");
    }
}
