
package renting_cars;


public class Resident extends customer{
   //attributes
    private int idCard;
    private String bankName;
 
    //constructors
    public Resident(int idCard, String bankName, String custNo, String name, String tel, String address, String nationality) {
        super(custNo, name, tel, address, nationality);
        this.idCard = idCard;
        this.bankName = bankName;
    }

    public Resident() {
    }

    //set and get
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    //To record customer data and facilitate the process of modifying and finding data
     public void recordDetails( String custNo, String name, String tel, String address, String nationality,int idCard,String bankName) {
      
       super.recordDetails(custNo, name , tel, address, nationality);
      
       this.setIdCard(idCard);
       this.setBankName(bankName);
   }

    @Override
    public String toString() {
        return "idCard=" + idCard + "\n bankName=" + bankName +super.toString();
    }
    
     
}
