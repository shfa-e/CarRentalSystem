

package renting_cars;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Rental {
    
  //attributes
     Date startDate;
     int numberOfDays;
     Date returnDate;
     double latenessDeduction;
     double damageDeduction;
    
    static Vehicle vehicle;
//constructors
    public void Rental(){
        
    }

    public Rental(Date startDate, int numberOfDays, Date returnDate, double latenessDeduction, double damageDeduction) {
        this.startDate = startDate;
        this.numberOfDays = numberOfDays;
        this.returnDate = returnDate;
        this.latenessDeduction = latenessDeduction;
        this.damageDeduction = damageDeduction;
    }

 public Rental(Date startDate,Date renturnDate){
  this.startDate=startDate;
  this.returnDate=renturnDate;
 
  
}
 
 // set and get
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getLatenessDeduction() {
        return latenessDeduction;
    }

    public void setLatenessDeduction(double latenessDeduction) {
        this.latenessDeduction = latenessDeduction;
    }

    public double getDamageDeduction() {
        return damageDeduction;
    }

    public void setDamageDeduction(double damageDeduction) {
        this.damageDeduction = damageDeduction;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
 
    //To calculate the process of returning the car
    
               public void processReturn(Date toDate){
     recordReturnDate(toDate);
     
     if(toDate.after(returnDate))
     {
        calcOverdueDays(toDate); 
     }
     vehicle.Available=true;
 }
          
 //Calculate the value of the extra days that must be paid
               public long calcOverdueDays(Date toDate){
    long diff=returnDate.getTime()-toDate.getTime();
    long days=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    return days;
}
     //Car return record
               public void recordReturnDate(Date returnDate){
    this.returnDate=returnDate;
}
//To calculate the discounts for the customer
               public double calclatenessDeduction(){
    return 1.5*getVehicle().DailyRate;
}

               public void calcDamageDeduction(){
    
}

    @Override
    public String toString() {
        return  "startDate=" + startDate + "\n numberOfDays=" + numberOfDays + "\n returnDate=" + returnDate + "\n latenessDeduction=" + latenessDeduction +
                "\ndamageDeduction=" + damageDeduction + "\n vehicle=" + vehicle;
    }


}

