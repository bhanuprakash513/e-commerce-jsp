package databeans;
// Generated Mar 28, 2011 9:22:35 AM by Hibernate Tools 3.2.1.GA



/**
 * Transactions generated by hbm2java
 */
public class Transactions  implements java.io.Serializable {


     private Integer tid;
     private Bills bills;
     private Products products;
     private int quantity;

    public Transactions() {
    }

    public Transactions(Bills bills, Products products, int quantity) {
       this.bills = bills;
       this.products = products;
       this.quantity = quantity;
    }
   
    public Integer getTid() {
        return this.tid;
    }
    
    public void setTid(Integer tid) {
        this.tid = tid;
    }
    public Bills getBills() {
        return this.bills;
    }
    
    public void setBills(Bills bills) {
        this.bills = bills;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}


