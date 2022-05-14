package FlightBookingSystem;

public class Passenger {
    private int passengerID;
    private String passengerName;
    private int passengerAge;
    private int foodChoice;

    public Passenger() {
        super();
    }
    public Passenger(int passengerID, String passengerName, int passengerAge, int foodChoice){
        super();
        this.passengerID= passengerID;
        this.passengerName= passengerName;
        this.passengerAge=passengerAge;
        this.foodChoice=foodChoice;
    }

    public String getPassengerName(){
        return passengerName;
    }
    public void setPassengerName(String passengerName){
        this.passengerName= passengerName;
    }
    public int getPassengerAge(){
        return passengerAge;
    }
    public void setPassengerAge(int passengerAge){
        this.passengerAge= passengerAge;
    }
    public int getPassengerID(){
        return passengerID;
    }
    public void setPassengerID(int passengerID){
        this.passengerID=passengerID;
    }
    public int getFoodChoice(){
        return foodChoice;
    }
    public void setFoodChoice(int foodChoice){
        this.foodChoice=foodChoice;
    }

}

