/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databeans.model;

import databeans.Categories;
import databeans.Products;
import databeans.Users;
import java.util.ArrayList;

/**
 *service agreement for admin
 * @author mahmoud
 */
public interface AdminService_Interface {
    /**
     *adds a new category entry to database table categories
     * @param cat the category to be inserted
     */
    void addCategory(Categories cat);
    /**
     *adds a new product entry to database table products
     * @param item the item to be inserted
     */
    void addProduct(Products item);
    /**
     *returns all the users in database table users
     * @return ArrayList of all users
     */
    ArrayList<Users> viewAllUsers();
    /**
     *modifies a product in the database table products
     * @param product: product data
     */
    void modifyProduct(Products product);
    /**
     *gets a user based on his ID in database table users
     * @param userID user ID
     */
    Users getUser(int userID);
    Categories getCategory(String catName);
}
