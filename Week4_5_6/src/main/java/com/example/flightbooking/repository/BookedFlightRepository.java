package com.example.flightbooking.repository;

import com.example.flightbooking.model.BookedFlight;
import com.example.flightbooking.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedFlightRepository extends JpaRepository<BookedFlight,Integer> {
}
