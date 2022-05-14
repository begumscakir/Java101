package com.example.flightbooking.model;

import com.example.flightbooking.repository.BookedFlightRepository;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "BookedFlight")
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookedFlight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
    @JoinColumn(name = "passenger_id")
    private List<Passenger> passengers;

    @OneToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER )
    @JoinColumn(name = "flight_id")
    private Flight flight;

    public BookedFlight(List<Passenger> passengers, Flight flight) {
        this.passengers = passengers;
        this.flight = flight;
    }
}
