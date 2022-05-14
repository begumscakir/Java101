package com.example.flightbooking.controller;

import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.service.BookedFlightService;
import com.example.flightbooking.service.FlightService;
import com.example.flightbooking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("flight-booking/passenger")
public class PassengerController {

    private final FlightService flightService;
    private final PassengerService passengerService;
    private final BookedFlightService bookedFlightService;
    @Autowired
    public PassengerController(FlightService flightService, PassengerService passengerService, BookedFlightService bookedFlightService) {
        this.flightService = flightService;
        this.passengerService = passengerService;
        this.bookedFlightService = bookedFlightService;
    }

    @GetMapping
    public ResponseEntity<List<Passenger>> getALlPassengers(){
        return new ResponseEntity<>(passengerService.getAllPassenger(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        return new ResponseEntity<>(passengerService.savePassenger(passenger), HttpStatus.OK);
    }

}
