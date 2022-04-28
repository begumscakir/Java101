package Flight;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class BookFlight_Main {
    public static void main(String[] args) {

        //Finding available flights
        Scanner searchInput = new Scanner(System.in);

        System.out.println("**Use English characters**");
        System.out.println("Please enter departure place: ");

        String from_data= searchInput.nextLine();

        System.out.println("Please enter arrival place: ");
        String to_data= searchInput.nextLine();

        System.out.println("Please enter your flight class preference (Economy or Business):");
        String flightClass_data= searchInput.nextLine();

        System.out.println("Please enter the departure date (YYYY-MM-DD, exp: 2022-04-18)");
        String date_data= searchInput.nextLine();

        System.out.println("Please enter number of seats you want to book: ");
        int seat_data= searchInput.nextInt();

        System.out.println();
        System.out.println("available flights:");


        Flight_Details.searchFlights(from_data,to_data, flightClass_data, LocalDate.parse(date_data), seat_data);

        System.out.println();
        System.out.println("Please enter 'Flight No:' of the flight you want to book: ");
        int flight_data= searchInput.nextInt();


        //Passenger Data
        List<Passenger_Food> passengerList=new LinkedList<>();

        Scanner input2 = new Scanner(System.in);

        for (int b=0; b<seat_data;b++){

        System.out.println();
        System.out.println("Please enter name to book: ");

        input2.next();

        String name_data= searchInput.nextLine();



        System.out.println("Please enter age: ");
        int age_data=searchInput.nextInt();

        System.out.println("Please enter ID: ");
        int ID_data= searchInput.nextInt();

        //Food Choice, adjust based on preference


        int foodChoice_data;
        String choose;

        System.out.println();
        System.out.println("Food Choice");
        System.out.println("Please enter 1 for 'Standard Meal', enter 2 for 'Diabetic Meal', enter 3 for 'Vegetarian Meal'," +
                "enter 4 for 'Gluten-free Meal'");

        foodChoice_data= input2.nextInt();


        switch (foodChoice_data){
            case 1:
                choose= "Standard Meal";
                break;
            case 2:
                choose= "Diabetic Meal";
                break;

            case 3:
                choose= "Vegetarian Meal";
                break;

            case 4:
                choose= "Gluten-free Meal";
                break;

        }


        passengerList.add(new Passenger_Food(ID_data,name_data,age_data,foodChoice_data));}



        Flight_Details.bookFlights(flight_data, passengerList);

        System.out.println();
        System.out.println("Your flight is booked, have a nice day.");

    }


}

