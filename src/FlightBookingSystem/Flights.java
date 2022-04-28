package FlightBookingSystem;
import java.time.LocalDate;

public class Flights {
    private int flightNumber;
    private String flightClass;
    private String fromAirport;
    private String toAirport;
    private int availableSeats;
    private int fare;
    private LocalDate doj;

    public Flights(){
        super();
    }

    public Flights(int flightNumber, String flightClass, String fromAirport, String toAirport, int availableSeats,
                   int fare, LocalDate doj){
    super();

        this.flightNumber = flightNumber;
        this.flightClass= flightClass;
        this.fromAirport= fromAirport;
        this.toAirport= toAirport;
        this.availableSeats= availableSeats;
        this.fare= fare;
        this.doj= doj;
    }

    public int getFlightNumber(){
        return flightNumber;

    } public String getFlightClass(){
        return flightClass;

    } public String getFromAirport(){
        return fromAirport;

    } public String getToAirport(){
        return toAirport;

    } public int getAvailableSeats(){
        return availableSeats;

    } public int getFare(){
        return fare;

    }public LocalDate getDoj(){
        return doj;}

}







