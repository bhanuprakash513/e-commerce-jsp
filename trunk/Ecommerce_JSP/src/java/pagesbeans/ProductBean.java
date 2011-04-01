/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pagesbeans;

/**
 *
 * @author islam
 */
public class ProductBean {
String productName;
int priceValue;
int quantity;
String picturePath;
String category;
String description;
    public ProductBean() {
    }

    public String getCategory() {
        return category;
    }

 

    public String getPicturePath() {
        return picturePath;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    


    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public void setPriceValue(int priceValue) {
        this.priceValue = priceValue;
    }

    public int getPriceValue() {
        return priceValue;
    }

   

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
