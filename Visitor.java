
package renting_cars;


public class Visitor extends customer {
   
    ///attributes
    private int passportNo;
    private int visitStart;
    private int visitEnd;
     
    //constructors
    public Visitor(int passportNo, int visitStart, int visitEnd, String custNo, String name, String tel, String address, String nationality) {
        super(custNo, name, tel, address, nationality);
        this.passportNo = passportNo;
        this.visitStart = visitStart;
        this.visitEnd = visitEnd;
    }

    public Visitor() {
    }

    // set and get 
    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }

    public int getVisitStart() {
        return visitStart;
    }

    public void setVisitStart(int visitStart) {
        this.visitStart = visitStart;
    }

    public int getVisitEnd() {
        return visitEnd;
    }

    public void setVisitEnd(int visitEnd) {
        this.visitEnd = visitEnd;
    }
    
    //To record customer data and facilitate the process of modifying and finding data
   public void recordDetails( String custNo, String name, String tel, String address, String nationality,int passportNo,int visitStar,int visitEnd) {
      
       super.recordDetails(custNo, name , tel, address, nationality);
      
       this.setPassportNo(passportNo);
       this.setVisitEnd(visitEnd);
       this.setVisitStart(visitStart);
   }

    
    public String toString() {
        return  "passportNo=" + passportNo + ", visitStart=" + visitStart + ", visitEnd=" + visitEnd +super.toString();
    }
    
   
    
    
    
}
