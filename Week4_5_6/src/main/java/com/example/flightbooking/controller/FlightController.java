package com.example.flightbooking.controller;

import com.example.flightbooking.model.Flight;
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
@RequestMapping("/v1/flight-booking/flight")
public class FlightController {

    private final FlightService flightService;
    private final PassengerService passengerService;
    private final BookedFlightService bookedFlightService;

    @Autowired
    public FlightController(FlightService flightService, PassengerService passengerService, BookedFlightService bookedFlightService) {
        this.flightService = flightService;
        this.passengerService = passengerService;
        this.bookedFlightService = bookedFlightService;
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getALlFlights(){
        return new ResponseEntity<>(flightService.getAllFlights(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight){
        return new ResponseEntity<>(flightService.saveFlight(flight), HttpStatus.OK);
    }

}
