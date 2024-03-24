
package renting_cars;


public class Van extends Vehicle{
     //attributes
    private int numberOfSeats;
    
    //constructor
    public Van(){
        numberOfSeats = 0;
    }

    public Van(int nos, int vn, String ma, String mo, String b, boolean a, double dr) {
        super(vn, ma, mo, b, a, dr);
        numberOfSeats = nos;
    }
    
    
    //set
    public void setNumberofSeats(int nos){
        numberOfSeats = nos;
    }
    
    //get
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    
    
    @Override
    public void registerVehicle(){
        if(Available = true){
            System.out.println("Van has been registered");
            
        }else{
            System.out.println("Van has not been registered please choose another van");
        }
     }

    @Override
    public String toString() {
        return "numberOfSeats=" + numberOfSeats +"\n"+ super.toString();
    }
    
    
    
}


