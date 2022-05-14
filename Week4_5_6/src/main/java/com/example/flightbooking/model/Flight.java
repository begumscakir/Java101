package com.example.flightbooking.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;



@Data
@Builder
@Entity(name = "Flight")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer flightNumber;
    private String flightClass;
    private String fromAirport;
    private String toAirport;
    private Integer availableSeats;
    private Integer fare;
    private LocalDate doj;

    public Flight(Integer flightNumber, String flightClass, String fromAirport, String toAirport, Integer availableSeats, Integer fare, LocalDate doj) {
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.availableSeats = availableSeats;
        this.fare = fare;
        this.doj = doj;

    }

}







