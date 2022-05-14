package com.example.flightbooking.config;

import com.example.flightbooking.model.Flight;
import com.example.flightbooking.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
@Configuration
public class FlightConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            FlightRepository flightRepository
    ){
        return args -> {

            List <Flight> allFlights= new LinkedList<>();

            allFlights. add(new Flight(7511, "Economy","Istanbul",
                    "Izmir",304, 936, LocalDate.now().plusDays(4)));

            allFlights. add(new Flight(7511, "Business","Istanbul",
                    "Izmir",42, 1688 , LocalDate.now().plusDays(4)));

            allFlights. add(new Flight(1790, "Economy","Istanbul",
                    "Baku",304, 2607 , LocalDate.parse("2022-04-29")));

            allFlights. add(new Flight(1790, "Business","Istanbul",
                    "Baku",42, 9566 , LocalDate.parse("2022-04-29")));

            allFlights. add(new Flight(1531, "Economy","Munich",
                    "Ankara",304, 2305, LocalDate.now()));

            allFlights. add(new Flight(1531, "Business","Munich",
                    "Ankara",42, 8940, LocalDate.now()));


            flightRepository.saveAll(allFlights);
        };
    }
}
