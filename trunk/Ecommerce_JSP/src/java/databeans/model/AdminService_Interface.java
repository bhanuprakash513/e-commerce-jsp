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
     *
     * @param cat
     */
    void addCategory(Categories cat);
    /**
     *
     * @param item
     */
    void addProduct(Products item);
    /**
     *
     * @return
     */
    ArrayList<Users> viewAllUsers();
    /**
     *
     * @param userName
     * @return
     */
    Users viewUser(int userID);
    /**
     *
     * @param product
     */
    void modifyProduct(int productID);
    /**
     *
     * @param user
     */
    Users showClientHistory(int userID);
}
