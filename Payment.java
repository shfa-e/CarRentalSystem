
package renting_cars;


public class Payment implements Total{
   
      
    //attributes
     int payDate;
    double totalAmountPaid;
    double totalDepositPaid;
    double totalDepositReturned;
    String calcTotalPayment;

   
    //constructors
    public Payment() {
            
    payDate = 0;
    totalAmountPaid = 0.0 ;
    totalDepositPaid = 0.0  ;
    totalDepositReturned = 0.0 ;
    
        }

        public Payment(int payDate, double totalAmountPaid, double totalDepositPaid, double totalDepositReturned) {
            this.payDate = payDate;
            this.totalAmountPaid = totalAmountPaid;
            this.totalDepositPaid = totalDepositPaid;
            this.totalDepositReturned = totalDepositReturned;
        }

        //set and get 
        public int getPayDate() {
            return payDate;
        }

        public void setPayDate(int payDate) {
            this.payDate = payDate;
        }

        public double getTotalAmountPaid() {
            return totalAmountPaid;
        }

        public void setTotalAmountPaid(double totalAmountPaid) {
            this.totalAmountPaid = totalAmountPaid;
        }

        public double getTotalDepositPaid() {
            return totalDepositPaid;
        }

        public void setTotalDepositPaid(double totalDepositPaid) {
            this.totalDepositPaid = totalDepositPaid;
        }

        public double getTotalDepositReturned() {
            return totalDepositReturned;
        }

        public void setTotalDepositReturned(double totalDepositReturned) {
            this.totalDepositReturned = totalDepositReturned;
        }
  
        //To calculate the total payments
    public double calcTotalPayment() {
       return (this.totalAmountPaid + this.totalDepositPaid);
   
       }
  
    //To account for the remainder of the payment
       public double calcRemainingDepost() {
       return  (this.totalAmountPaid + this.totalDepositPaid);
  
       }

       //Amount received from the customer
       public String issueReceipt() {
       return "You have successfully rented a vehicle at " + this.calcTotalPayment ;
   }

        public String toString() {
            return  "payDate=" + payDate + ", totalAmountPaid=" + totalAmountPaid +
                    ", totalDepositPaid=" + totalDepositPaid + ", totalDepositReturned=" + totalDepositReturned ;
        }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
  
   
}
