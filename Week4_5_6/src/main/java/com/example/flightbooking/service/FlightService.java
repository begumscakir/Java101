package com.example.flightbooking.service;

import com.example.flightbooking.Exception.FlightNotFoundException;
import com.example.flightbooking.model.Flight;
import com.example.flightbooking.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository, PassengerService passengerService){
        this.flightRepository = flightRepository;
    }

    public Flight saveFlight(Flight flight){
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        List<Flight> temp = new ArrayList<>();
        List<Flight> flights = flightRepository.findAll();
        for (Flight f : flights) {
            if (f.getAvailableSeats() > 0) {
                temp.add(f);
            }
        }
        return temp;
    }


    public void updateSeatNumber(Flight chosenFlight){

        flightRepository.save(chosenFlight);

    }

}
