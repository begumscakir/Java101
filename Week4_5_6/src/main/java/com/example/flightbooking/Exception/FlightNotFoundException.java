package com.example.flightbooking.Exception;

public class FlightNotFoundException extends RuntimeException{

    public FlightNotFoundException(String message){
        super(message);
    }
}
