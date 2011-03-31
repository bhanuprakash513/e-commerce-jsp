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
String email;
String quantity;
String picturePath;
String category;

    public ProductBean() {
    }

    public String getCategory() {
        return category;
    }

    public String getEmail() {
        return email;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


}
