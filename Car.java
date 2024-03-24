
package renting_cars;


public class Car extends Vehicle{
     //attributes
    private String carType;
    private String carSize;
    
    
    //constructors

    public Car() {
        carType = null;
        carSize = null;
    }

    public Car(String ct, String cs, int vn, String ma, String mo, String b, boolean a, double dr) {
        super(vn, ma, mo, b, a, dr);
        carType = ct;
        carSize = cs;
    }
    
    //set
    public void setCarType(String ct){
        carType = ct;
    }
    
    public void setCarSize(String cs){
        carSize = cs;
    }
    
    //get
    public String getCarType(){
        return carType;
    }
    public String getCarSize(){
        return carSize;
    }
    
    
    @Override
    public void registerVehicle(){
        if(Available = true){
            System.out.println("Car has been registered");
            
        }else{
            System.out.println("Car has not been registered please choose another car");
        }
    }

    @Override
    public String toString() {
        return  "carType:" + carType + "\ncarSize:" + carSize +"\n"+ super.toString();
    }
    
    
}
