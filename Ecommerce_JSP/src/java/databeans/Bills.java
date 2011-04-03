package databeans;
// Generated Mar 28, 2011 9:22:35 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bills generated by hbm2java
 */
public class Bills  implements java.io.Serializable {


     private Integer billId;
     private Users users;
     private Date date;
     private double totalPrice;
     private boolean final_;
     private Set transactionses = new HashSet(0);

    public Bills() {
    }

	
    public Bills(Users users, Date date, double totalPrice, boolean final_) {
        this.users = users;
        this.date = date;
        this.totalPrice = totalPrice;
        this.final_ = final_;
    }
    public Bills(Users users, Date date, double totalPrice, boolean final_, Set transactionses) {
       this.users = users;
       this.date = date;
       this.totalPrice = totalPrice;
       this.final_ = final_;
       this.transactionses = transactionses;
    }
   
    public Integer getBillId() {
        return this.billId;
    }
    
    public void setBillId(Integer billId) {
        this.billId = billId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public boolean isFinal_() {
        return this.final_;
    }
    
    public void setFinal_(boolean final_) {
        this.final_ = final_;
    }
    public Set getTransactionses() {
        return this.transactionses;
    }
    
    public void setTransactionses(Set transactionses) {
        this.transactionses = transactionses;
    }




}

