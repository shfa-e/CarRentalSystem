
package renting_cars;


public abstract class Vehicle {
      //attributes
    protected int VehcileNo;
    protected String Make;
    protected String Brand;
    protected String Model;
    protected double DailyRate;
   
    public boolean Available;
    //constructor
    public Vehicle(){
        VehcileNo = 0;
        Make = null;
        Brand = null;
        Model = null;
        Available = false;
        DailyRate = 0;
    }
    
    public Vehicle(int vn, String ma, String mo, String b, boolean a, double dr){
        VehcileNo = vn;
        Make = ma;
        Model = mo;
        Brand = b;
        Available = a;
        DailyRate = dr;
    }
    
    //set 
    public void setVehicleNo(int vn){
        VehcileNo = vn;
    }
    
    public void setMake(String ma){
        Make = ma;
    }
    
    public void setBrand(String b){
        Brand = b;
    }
    
    public void setModel(String mo){
        Model = mo;
    }
    
    public void setAvailable(boolean a){
        Available = a;
    }
    
    public void setDailyRate(double dr){
        DailyRate = dr;
    }
    
    //get
    public int getVehicleNo(){
        return VehcileNo;
    }
    
    public String getMake(){
        return Make;
    }
    
    public String getBrand(){
        return Brand;
    }
    
    public String getModel(){
        return Model;
    }
    
    public boolean getAvailable(){
        return Available;
    }
    
    public double getDailyRate(){
        return DailyRate;
    }
    
    public abstract void registerVehicle();

    @Override
    public String toString() {
        return  "VehcileNo:" + VehcileNo + "\n Make:" + Make + "\nBrand:" + Brand +
                "\nModel:" + Model + "\nDailyRate:" + DailyRate + "\nAvailable:" + Available ;
    }
    
    

}


