
package renting_cars;

import java.util.ArrayList;

public class customer {
   
    // variables 
    private String customerId;;
    private String name;
    private  String tel;
    private String address;
    private String nationality;
    
 //costractur 
    public customer(String customerId, String name, String tel, String address, String nationality) {
        this.customerId = customerId;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.nationality = nationality;
    }

    public customer() {
       
    }
/// set and get
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String custNo) {
        this.customerId = custNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    } //end set and get
    
    
/// To record customer data and facilitate the process of modifying and finding data
    
    
     public void recordDetails(String custNo, String name, String tel, String address, String nationality) {
      
       this.customerId = custNo;
       this.name = name;
       this.tel = tel;
       this.address = address;
       this.nationality = nationality;
    
}
     //A function to find the customer by the customerid
         public static String findCustomer(ArrayList <customer> customers, String customerID) {

     for (int i = 0; i < customers.size(); i++) {

     if(customers.get(i).getCustomerId()==customerID);

     return ("Yes, it is in the index"+i); }

return " he doesn't exist"; 

}
         //Function to change customer data
 public void editCustomer(customer b,String custNo, String name, String tel, String address, String nationality){
     b.recordDetails(custNo, name, tel, address, nationality);
 }

 // To ensure that the customer returned the car
 public boolean returnVehicle(boolean a){
    return Rental.vehicle.getAvailable();
        
    }

 @Override
    public String toString() {
        return  "customerId=" + customerId + "\n name=" + name + "\n tel=" + tel + "\n address=" + address + "\n nationality=" + nationality ;
    }//to print the value
    
  }
