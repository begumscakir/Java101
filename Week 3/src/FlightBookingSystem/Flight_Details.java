package FlightBookingSystem;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Flight_Details {

    private static List <Flights> allFlights= new LinkedList<>();
    static {
        // Make changes (add/change/remove flights) based on available flights and their data.

        allFlights. add(new Flights(7511, "Economy","Istanbul",
                "Izmir",304, 936, LocalDate.now().plusDays(4)));

        allFlights. add(new Flights(7511, "Business","Istanbul",
                "Izmir",42, 1688 , LocalDate.now().plusDays(4)));

        allFlights. add(new Flights(1790, "Economy","Istanbul",
                "Baku",304, 2607 , LocalDate.parse("2022-04-29")));

        allFlights. add(new Flights(1790, "Business","Istanbul",
                "Baku",42, 9566 , LocalDate.parse("2022-04-29")));

        allFlights. add(new Flights(1531, "Economy","Munich",
                "Ankara",304, 2305, LocalDate.now()));

        allFlights. add(new Flights(1531, "Business","Munich",
                "Ankara",42, 8940, LocalDate.now()));
    }

public Flight_Details(){

}public static Flights findFlight (int flightNumber){
        Flights temp= null;
        for (Flights f : allFlights){
            if (f.getFlightNumber()==flightNumber){
                temp = f;
                break;
            }
        }
        return temp;
    }

public static void searchFlights(String fromAirport, String toAirport, String flightClass, LocalDate doj, int numberSeats){

        List<Flights>searchForAFlight = new LinkedList<>();

        for (Flights f:allFlights){
            if(f.getFromAirport().equals(fromAirport) && f.getToAirport().equals(toAirport)
            && f.getFlightClass().equals(flightClass) && f.getDoj().equals(doj)
            && f.getAvailableSeats()> numberSeats){
            searchForAFlight.add(f);}

        }

            if(searchForAFlight.size()==0){
            System.out.println("No flights found for the search.");
                System.exit(0);
            }else{
            System.out.println("Flight No:\t\tfrom Airport:\t\tto Airport:\t\tDate:\t\tFlight Class:\t\tAvailable Seats\t\t" +
                    "Fare (1 Person):");
            System.out.println();

            for (Flights f: searchForAFlight){
                System.out.printf("%5d%20s%17s%20s%12s%20d%20d\n",f.getFlightNumber(),f.getFromAirport(),
                        f.getToAirport(), f.getDoj(),f.getFlightClass(),f.getAvailableSeats(),f.getFare());}
            }

    }

    //Total fare
    public static void bookFlights(int flightNumber, List<Passenger>passengerList){

        int numberSeats= passengerList.size();

        Flights tempFlight = findFlight(flightNumber);
        int fare =tempFlight.getFare();
        int totalFare= fare * numberSeats;

    }

}

