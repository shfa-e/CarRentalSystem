
package renting_cars;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Renting {
  
    
    
 

    public static void main(String[] args) {
         
       Date fromDate = new Date();
      
       Date toDate = new Date();
       toDate.setHours(10 * 3600);
      
       Rental re = new Rental(fromDate,toDate);
       Payment pay =new Payment();
      
       //list of vehciles
        ArrayList<Vehicle> my_car = new ArrayList<>();

        my_car.add(new Car("camry", "sedan", 113344, "Commonwealth ,of Kentucky", "2022", "Toyota", true, 50));
        my_car.add(new Car("Mazda6", "sedan", 556677, "Japan", "2021", "Mazda", true, 75));
        my_car.add(new Car("yarris", "sedan", 889900, "Japan", "2021", "Toyota", true, 40));
        my_car.add(new Car("camry", "sedan", 1234456, "Commonwealth of Kentucky", "2022", "Toyota", true, 45));
        my_car.add(new Car("Mazda6", "sedan", 789101, "Japan", "2021", "Mazda", true, 60));
        my_car.add(new Car("yarris", "sedan", 234567, "Japan", "2021", "Toyota", true, 35));
        my_car.add(new Van(13, 112233, "Japan", "2022", "Toyota", true, 125));
        my_car.add(new Van(12, 445566, "Korea", "2021", "Hyundai", true, 125));
        my_car.add(new Van(12, 778899, "USA", "2021", "Ford", true, 140));
        my_car.add(new Van(13, 101011, "Japan", "2022", "Toyota", true, 130));
        my_car.add(new Van(12, 223344, "Korea", "2021", "Hyundai", true, 130));
        my_car.add(new Van(12, 445566, "USA", "2021", "Ford", true, 135));

        Scanner in = new Scanner(System.in);
        
        //login
        System.out.println("Login: (Type yes/no)");
        String user = in.next();

        Resident r = new Resident();
        Visitor v = new Visitor();

       
        switch (user) {
            case "yes":
                System.out.println("\nWelcome!, please fill in the following:");
                
                // resident or visitor
                System.out.println("\nChoose: \n1.Resident \n2.Visitor");
                String userType = in.next();

                switch (userType) {
                    case "1":
                        
                        //customers general information
                        System.out.print("\nEnter Customers Name: ");
                        String name = in.next();

                        System.out.print("Enter Customers telephone number: ");
                        String tel = in.next();

                        System.out.print("Enter Customers Address: ");
                        String address = in.next();

                        System.out.print("Enter Customers Nationality: ");
                        String nationality = in.next();

                        System.out.print("Enter Customer ID: ");
                        String customerId = in.next();

                        r.setName(name);
                        r.setTel(tel);
                        r.setAddress(address);
                        r.setNationality(nationality);
                        r.setCustomerId(customerId);

                        System.out.print("\nEnter Customers ID Card: ");
                        int idCard = in.nextInt();

                        System.out.print("Enter Customers Bank name: ");
                        String bankName = in.next();

                        r.setIdCard(idCard);
                        r.setBankName(bankName);

                        System.out.println("\nChoose: \n1.Car \n2.Van");
                        String vehcile = in.next();

                        switch (vehcile) {
                            
                            //prints cars
                            case "1":
                                System.out.println("The Cars we have\n");
                                for (int i = 0; i < 6; i++) {
                                    System.out.print("Car " + (i + 1) + "\n");
                                    System.out.print(my_car.get(i) + "\n");
                                    System.out.print("\n");
                                }
                                //Choose from the available cars
                                System.out.println("\nWhich Car would you like? ");
                                String car = in.next();

                                switch (car) {
                                    
                                    //prints payment and rental details, And the commands to be executed after choosing the car
                                    case "1":
                                        System.out.println(my_car.get(0));
                                        //Reserve the car with the vehicle classes and send it to the rental class
                                        my_car.get(0).setAvailable(false);
                                         re.setVehicle(my_car.get(0));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num = in.nextInt();
                                        re.setNumberOfDays(num);
                                        //billing account
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*50); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");break;
                                         //We will repeat the steps for each vehicle selected by the customer
                                    case "2":
                                        System.out.println(my_car.get(1));
                                        my_car.get(1).setAvailable(false);
                                        re.setVehicle(my_car.get(1));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num1 = in.nextInt();
                                        re.setNumberOfDays(num1);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*75); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "3":
                                        System.out.println(my_car.get(2));
                                        my_car.get(2).setAvailable(false);
                                        re.setVehicle(my_car.get(2));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num2 = in.nextInt();
                                        re.setNumberOfDays(num2);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*40); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "4":
                                         System.out.println(my_car.get(3));
                                        my_car.get(3).setAvailable(false);
                                        re.setVehicle(my_car.get(3));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num3 = in.nextInt();
                                        re.setNumberOfDays(num3);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*45); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "5":
                                        System.out.println(my_car.get(4));
                                        my_car.get(4).setAvailable(false);
                                        re.setVehicle(my_car.get(4));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num4 = in.nextInt();
                                        re.setNumberOfDays(num4);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*60); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "6":
                                        System.out.println(my_car.get(5));
                                        my_car.get(5).setAvailable(false);
                                        re.setVehicle(my_car.get(5));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num5 = in.nextInt();
                                        re.setNumberOfDays(num5);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*35); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                }

                                break;
                            case "2":
                                
                                //prints vans
                                System.out.println("The Vans we have\n");
                                for (int i = 6; i < my_car.size(); i++) {

                                    System.out.print("Van " + (i - 5) + "\n");
                                    System.out.print(my_car.get(i) + "\n");
                                    System.out.print("\n");
                                }

                                System.out.print("\nWhich Van would you like? ");
                                String van = in.next();

                                switch (van) {
                                    //prints payment and rental details ,, We will repeat the steps we did when the customer chose the car, but in the van case
                                    case "1":
                                        System.out.println(my_car.get(6));
                                        my_car.get(6).setAvailable(false);
                                        re.setVehicle(my_car.get(6));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num = in.nextInt();
                                        re.setNumberOfDays(num);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*125); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "2":
                                        System.out.println(my_car.get(7));
                                        my_car.get(7).setAvailable(false);
                                        re.setVehicle(my_car.get(7));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num1 = in.nextInt();
                                        re.setNumberOfDays(num1);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*125); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "3":
                                        System.out.println(my_car.get(8));
                                        my_car.get(8).setAvailable(false);
                                        re.setVehicle(my_car.get(8));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num2 = in.nextInt();
                                        re.setNumberOfDays(num2);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*140); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "4":
                                       System.out.println(my_car.get(9));
                                        my_car.get(9).setAvailable(false);
                                        re.setVehicle(my_car.get(9));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num3 = in.nextInt();
                                        re.setNumberOfDays(num3);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*130); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "5":
                                        System.out.println(my_car.get(10));
                                        my_car.get(10).setAvailable(false);
                                        re.setVehicle(my_car.get(10));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num4 = in.nextInt();
                                        re.setNumberOfDays(num4);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*130); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "6":
                                        System.out.println(my_car.get(11));
                                        my_car.get(11).setAvailable(false);
                                        re.setVehicle(my_car.get(11));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num5 = in.nextInt();
                                        re.setNumberOfDays(num5);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*135); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                }

                                break;

                        }
                        break;

                    case "2":
                        
                        //visitors general information
                        System.out.print("\nEnter Customers Name: ");
                        String name_v = in.next();

                        System.out.print("Enter Customers telephone number: ");
                        String tel_v = in.next();

                        System.out.print("Enter Customers Address: ");
                        String address_v = in.next();

                        System.out.print("Enter Customers Nationality: ");
                        String nationality_v = in.next();

                        System.out.print("Enter Customer ID: ");
                        String customerId_v = in.next();

                        v.setName(name_v);
                        v.setTel(tel_v);
                        v.setAddress(address_v);
                        v.setNationality(nationality_v);
                        v.setCustomerId(customerId_v);

                        System.out.print("\nEnter Customers Passport Number: ");
                        int passportNo = in.nextInt();

                        System.out.print("Enter Customers Visit Start: ");
                        int visitStart = in.nextInt();

                        System.out.print("Enter Customers Visit End: ");
                        int visitEnd = in.nextInt();

                        v.setPassportNo(passportNo);
                        v.setVisitStart(visitStart);
                        v.setVisitEnd(visitEnd);

                        System.out.println("\nChoose: \n1.Car \n2.Van");
                        String vehcile_v = in.next();
                           //Here we will repeat the steps we took about choosing the valued customer, but for the visitor
                        switch (vehcile_v) {
                            
                            //lists cars
                            case "1":
                                System.out.println("\nThe Cars we have\n");
                                for (int i = 0; i < 6; i++) {
                                    System.out.print("Car " + (i + 1) + ":\n");
                                    System.out.print(my_car.get(i) + "\n");
                                    System.out.print("\n");
                                }

                                System.out.print("\nWhich Car would you like? ");
                                String car_v = in.next();

                                switch (car_v) {
                                    
                                    //prints payment and rental details 
                                    case "1":
                                        System.out.println(my_car.get(0));
                                        my_car.get(0).setAvailable(false);
                                        re.setVehicle(my_car.get(0));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num = in.nextInt();
                                        re.setNumberOfDays(num);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*50); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;

                                    case "2":
                                        System.out.println(my_car.get(1));
                                        my_car.get(1).setAvailable(false);
                                        re.setVehicle(my_car.get(1));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num1 = in.nextInt();
                                        re.setNumberOfDays(num1);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*75); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "3":
                                        System.out.println(my_car.get(2));
                                        my_car.get(2).setAvailable(false);
                                        re.setVehicle(my_car.get(2));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num2 = in.nextInt();
                                        re.setNumberOfDays(num2);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*40); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "4":
                                        System.out.println(my_car.get(3));
                                        my_car.get(3).setAvailable(false);
                                        re.setVehicle(my_car.get(3));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num3 = in.nextInt();
                                        re.setReturnDate(toDate);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*45); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "5":
                                        System.out.println(my_car.get(4));
                                        my_car.get(4).setAvailable(false);
                                        re.setVehicle(my_car.get(4));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num4 = in.nextInt();
                                        re.setNumberOfDays(num4);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*60); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "6":
                                        System.out.println(my_car.get(5));
                                        my_car.get(5).setAvailable(false);
                                        re.setVehicle(my_car.get(5));
                                        System.out.println("\nHow many days will you use the car?");
                                        int num5 = in.nextInt();
                                        re.setNumberOfDays(num5);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*35); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the car is damaged, the Deposit amount will not be refunded");
                                        break;

                                }

                                break;
                            case "2":
                                //lists vans
                                
                                System.out.println("\nThe Vans we have\n");
                                for (int i = 6; i < my_car.size(); i++) {

                                    System.out.print("Van " + (i - 5) + "\n");
                                    System.out.print(my_car.get(i) + "\n");
                                    System.out.print("\n");
                                }

                                System.out.print("\nWhich Van would you like? ");
                                String van_v = in.next();

                                switch (van_v) {
                                    
                                    //prints payment and rental details
                                    case "1":
                                        System.out.println(my_car.get(6));
                                        my_car.get(6).setAvailable(false);
                                        re.setVehicle(my_car.get(6));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num = in.nextInt();
                                        re.setNumberOfDays(num);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*125); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "2":
                                        System.out.println(my_car.get(7));
                                        my_car.get(7).setAvailable(false);
                                        re.setVehicle(my_car.get(7));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num1 = in.nextInt();
                                        re.setNumberOfDays(num1);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*125); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "3":
                                        System.out.println(my_car.get(8));
                                        my_car.get(8).setAvailable(false);
                                        re.setVehicle(my_car.get(8));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num2 = in.nextInt();
                                        re.setNumberOfDays(num2);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*140); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "4":
                                        System.out.println(my_car.get(9));
                                        my_car.get(9).setAvailable(false);
                                        re.setVehicle(my_car.get(9));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num3 = in.nextInt();
                                        re.setNumberOfDays(num3);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*130); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "5":
                                        System.out.println(my_car.get(10));
                                        my_car.get(10).setAvailable(false);
                                        re.setVehicle(my_car.get(10));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num4 = in.nextInt();
                                        re.setNumberOfDays(num4);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*130); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                    case "6":
                                        System.out.println(my_car.get(11));
                                        my_car.get(11).setAvailable(false);
                                        re.setVehicle(my_car.get(11));
                                        System.out.println("\nHow many days will you use the Van?");
                                        int num5 = in.nextInt();
                                        re.setNumberOfDays(num5);
                                        pay.setTotalAmountPaid(re.getNumberOfDays()*135); 
                                        pay.setTotalDepositPaid(50);
                                        
                                        System.out.println("\nTotal Payment: "+pay.calcTotalPayment()+"\nDeposit Paid: "+pay.totalDepositPaid +"\nIf the van is damaged, the Deposit amount will not be refunded");
                                        break;
                                        
                                }

                                break;

                        }
                        break;

                }

                break;

            case "no":
                System.out.println("Thank you, we hope you come next time");
                break;
                
            default:
                //exception
                throw new IllegalArgumentException("if you want to rent a car, run the program again and type in yes, if not type in no");
            
        }  
     
    }
}