package com.example.flightbooking.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice

public class CustomExceptionHandler {

    @ExceptionHandler(FlightNotFoundException.class)
    public ResponseEntity<?>flightNotFound (FlightNotFoundException flightNotFoundException){
        List<String>details= new ArrayList<>();
        details.add(flightNotFoundException.getMessage());
        ErrorResponse errorResponse= new ErrorResponse("Searched flight not found.", details);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
