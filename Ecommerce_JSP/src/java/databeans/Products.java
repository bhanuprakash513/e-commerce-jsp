package databeans;
// Generated Mar 28, 2011 9:22:35 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer productId;
     private Categories categories;
     private String name;
     private int price;
     private Integer quantity;
     private String description;
     private String pictureLink;
     private Set transactionses = new HashSet(0);

    public Products() {
    }

	
    public Products(Categories categories, String name, int price, String pictureLink) {
        this.categories = categories;
        this.name = name;
        this.price = price;
        this.pictureLink = pictureLink;
    }
    public Products(Categories categories, String name, int price, Integer quantity, String description, String pictureLink, Set transactionses) {
       this.categories = categories;
       this.name = name;
       this.price = price;
       this.quantity = quantity;
       this.description = description;
       this.pictureLink = pictureLink;
       this.transactionses = transactionses;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPictureLink() {
        return this.pictureLink;
    }
    
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
    public Set getTransactionses() {
        return this.transactionses;
    }
    
    public void setTransactionses(Set transactionses) {
        this.transactionses = transactionses;
    }




}

