package com.example.flightbooking.service;

import com.example.flightbooking.model.Flight;
import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.repository.PassengerRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository){
        this.passengerRepository = passengerRepository;
    }

    public Passenger savePassenger(Passenger passenger ){
        return passengerRepository.save(passenger);
    }

    public List<Passenger> getAllPassenger(){
        return passengerRepository.findAll();
    }
}
