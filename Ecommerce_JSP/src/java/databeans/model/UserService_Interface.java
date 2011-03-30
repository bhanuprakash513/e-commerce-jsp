/*
 * service agreement to database service provided for the website
 */

package databeans.model;

import databeans.Bills;
import databeans.Categories;
import databeans.Products;
import databeans.Transactions;
import databeans.Users;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author mahmoud
 */
public interface UserService_Interface {
    /**
     *user sign in with user name and password
     * @param userName user email
     * @param pwd user password
     * @return true for success, false with failure
     */
    boolean signIn(String userName, String pwd);
    /**
     *register a new user into database, a user cart is created automatically and set to be
     * empty and non-final (i.e. cart not bill)
     * @param user bean used to fill database entry
     */
    void signUp(Users user);
    /**
     * gets all products in products table in database
     * @return ArrayList of all products
     */
    ArrayList<Products> getAllProducts();
    /**
     *gets all products with the given category
     * @param catID category id
     * @return Set of products
     */
    Set<Products> getCategoryProducts(int catID);
    /**
     *view given user cart
     * @param user
     * @return Set of user transactions, null if there is no transactions
     */
    Set<Transactions> viewMyCart(int userID);
    /**
     *sets user cart to bill, by making column final = true
     * @param cart user cart
     * @return true if user credit and supply of items in stuf are sufficient
     *      false otherwise
     */
    boolean submitMyCart(Bills cart);
    /**
     *show user profile
     * @param userID the user id
     */
    Users showMyProfile(int userID);
    /**
     *adds a new transaction to user cart
     * @param t user added transaction
     */
    boolean addToCart(Transactions t);
    /**
     *removes a transaction from user cart
     * @param tid
     */
    void removeFromCart(int tid);
    /**
     *removes all transactions from user cart
     * @param cartID user cart id
     */
    void emptyCart(int cartID);
    /**
     *returns all categories in database
     * @return list of all categories
     */
    ArrayList<Categories> getAllCategories();
    
    
}