package trainTicketCaseStudy;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ticket {
    private int counter = 100;
    private String pnr;
    private GregorianCalendar travelDate;
    private Train train;
    private TreeMap <Passenger, Double> passengers;

    public Ticket(Train train, int year, int month, int day) {
        this.train = train;
        this.travelDate = new GregorianCalendar(year, month - 1, day);
        this.pnr = generatePNR();
        passengers = new TreeMap<>();
    }



    public String generatePNR(){
     
                String S=String.valueOf(train.getSource().charAt(0)) ;
                String D=String.valueOf(train.getDestination().charAt(0));
               String date= travelDate.toZonedDateTime().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
               String pnr=S+D+"_"+date+"_" +counter++;
                if(travelDate.after(GregorianCalendar.DAY_OF_MONTH))
                	return pnr;
                else 
                	return "enter valid Date";

    }

    public double calcPassengerFare( Passenger passenger)
    {
        if (passenger.getAge() <= 12)
        {
            return train.getTicketPrice() * 0.5;
        }
        if (passenger.getAge() >= 60)
        {
            return train.getTicketPrice() *0.6;
        }
        if (passenger.getGender() == 'F' || passenger.getGender() =='f')
        {
            return train.getTicketPrice() * 0.75;
        } else{
            return train.getTicketPrice();
        }
    }

    public void addPassenger(Passenger pass){
        passengers.put(pass,calcPassengerFare(pass));
    }

    public double calculateTotalTicketPrice(){
        return 0.0;
    }

    public void generateTicket() throws IOException {
        getPassengers();
    }

    public void writeTicket(){
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTravelDate() {
        return travelDate.toZonedDateTime()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setTravelDate(GregorianCalendar travelDate) {
        this.travelDate = travelDate;
    }

    public TreeMap<Passenger, Double> getPassengers() {
        return passengers;
    }
   
   
}
