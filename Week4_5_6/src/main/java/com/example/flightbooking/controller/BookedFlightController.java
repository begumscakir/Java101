package com.example.flightbooking.controller;

import com.example.flightbooking.model.BookedFlight;
import com.example.flightbooking.model.Flight;
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
@RequestMapping("flight-booking/bookedFlight")
public class BookedFlightController {

    private final FlightService flightService;
    private final PassengerService passengerService;
    private final BookedFlightService bookedFlightService;
    @Autowired
    public BookedFlightController(PassengerService passengerService, FlightService flightService, BookedFlightService bookedFlightService) {
        this.passengerService = passengerService;
        this.flightService = flightService;
        this.bookedFlightService = bookedFlightService;
    }
    @GetMapping
    public ResponseEntity<List<BookedFlight>>findALlBookedFlight(){
        return new ResponseEntity<>(bookedFlightService.getAllBookedFlight(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BookedFlight> bookFlight(@RequestBody List<Passenger> passengers, @RequestParam(defaultValue="1790") String flightNumber){

        Integer flightNumberInt = Integer.parseInt(flightNumber);
        return new ResponseEntity<>(bookedFlightService.saveBookedFlight(passengers,flightNumberInt), HttpStatus.OK);
    }



}
