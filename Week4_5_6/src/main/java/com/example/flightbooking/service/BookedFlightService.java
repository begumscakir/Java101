package com.example.flightbooking.service;

import com.example.flightbooking.Exception.FlightNotFoundException;
import com.example.flightbooking.model.BookedFlight;
import com.example.flightbooking.model.Flight;
import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.repository.BookedFlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class BookedFlightService {


    private final BookedFlightRepository bookedFlightRepository;
    private final FlightService flightService;
    private final PassengerService passengerService;

    public BookedFlightService(BookedFlightRepository bookedFlightRepository, FlightService flightService,
                               PassengerService passengerService) {
        this.bookedFlightRepository = bookedFlightRepository;
        this.flightService = flightService;
        this.passengerService = passengerService;
    }
    public BookedFlight saveBookedFlight(List<Passenger> passengers , Integer flightNumber){


        Flight chosenFlight = new Flight();
        List<Flight> chosenFlights = flightService.getAllFlights();

        System.out.println(chosenFlights);
        for(Flight f : chosenFlights){
            if(Objects.equals(f.getFlightNumber(), flightNumber)){
                chosenFlight = f;
            }else {
                throw new FlightNotFoundException("Searched flight cannot found.");
            }
        }
        chosenFlight.setFlightNumber(chosenFlight.getFlightNumber()-passengers.size());


        BookedFlight bookedFlight = new BookedFlight(passengers,chosenFlight);

        bookedFlight.setId(bookedFlightRepository.findAll().size()+1);
      System.out.println(bookedFlight);
        flightService.updateSeatNumber(chosenFlight);


        return bookedFlightRepository.save(bookedFlight);

    }

    public List<BookedFlight> getAllBookedFlight(){

        return bookedFlightRepository.findAll();
    }

}
