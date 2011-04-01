/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databeans.model;

import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import databeans.Bills;
import databeans.Categories;
import databeans.Products;
import databeans.Transactions;
import databeans.Users;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.Query;

/**
 *the business logic and data access operations combined in this class
 * to use this class, use the static method createServiceInstance() and cast it to the reference
 * interface UserService_Interface, after that business methods can be invoked from interface
 * reference
 * @author mahmoud
 */
public class UserService implements UserService_Interface{
    /**
     * used to commit transactions
     */
    private Session session;
    /**
     * the only UserService instance, used to supply one and only one connection to database
     * to save connection time between all users
     */
    private static UserService service = new UserService();
    /**
     * private constructor to use singleton design pattern
     * builds the session object
     */
    private UserService() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
    }
    /**
     * returns the only instance of UserService
     * @return
     */
    public static UserService getServiceInstance(){
        return service;
    }

    public boolean signIn(String userName, String pwd) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Criteria loginCriteria = session.createCriteria(Users.class);
        //matchin user name
        Criterion nameCriterion = Restrictions.eq("name", userName);
        //matching password
        Criterion passwordCriterion = Restrictions.eq("password", pwd);
        loginCriteria.add(nameCriterion).add(passwordCriterion);
        List<Users> result = (List<Users>)loginCriteria.list();
        //checking for results, only one result should be obtained
        if(result.isEmpty()){
            System.out.println("login failed");
            return false;
        }
        //user is valid and has signed in, sign in logic goes here
        //formatting system time to be used
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(cal.getTime());

        //creating cart of the user
        boolean flag = true;
        Users user = result.get(0);
        for(Bills bill : (Set<Bills>)user.getBillses()){
            if(!bill.isFinal_()){
                flag = false;
            }
        }
        if(flag){
            //means that client has no unpaid carts, so we create a new one for him
            Bills cart = new Bills(result.get(0), new Date(sdf.format(cal.getTime())), 0, false);
            session.beginTransaction();
            session.persist(cart);
            session.getTransaction().commit();
        }
        System.out.println("login successeded");
        return true;
    }

    public void signUp(Users user) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //adding new user to database
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();

    }

    public ArrayList<Products> getAllProducts() {
        //throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Products";
        Query q = session.createQuery(queryString);
        return (ArrayList<Products>)q.list();
    }

    public Set<Products> getCategoryProducts(int catID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //selecting category
        String queryString = "FROM Categories c WHERE c.id=:cat_id";
        Query q = session.createQuery(queryString);
        q.setInteger("cat_id", catID);
        Categories cat = (Categories)(q.list().get(0));
        return cat.getProductses();
    }

    public Set<Transactions> viewMyCart(int userID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //view all user bills
        String queryString = "FROM Bills b WHERE b.user_id=:uid";
        Query q = session.createQuery(queryString);
        q.setInteger("uid", userID);
        List<Bills> bills = (List<Bills>)q.list();
        //checking if the bill is not submitted (i.e. cart)
        for(Bills bill : bills){
            if(!bill.isFinal_()){
                return bill.getTransactionses();
            }
        }
        //means no cart yet
        return null;
    }

    public boolean submitMyCart(int cartID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //getting user Bill (cart)
        String queryString = "FROM Bills b WHERE b.billId=:cid";
        Query q = session.createQuery(queryString);
        q.setInteger("cid", cartID);
        Bills cart = (Bills)q.list().get(0);

        Users user = cart.getUsers();
        //reducing user cart
        if(user.getCredit() >= cart.getTotalPrice()){
            //means that user has enough credit to cover his cart
            user.setCredit(user.getCredit() - cart.getTotalPrice());

            //saving transactions and reducing products at stock
            for(Transactions t : (Set<Transactions>)cart.getTransactionses()){
                Products item = t.getProducts();
                item.setQuantity(item.getQuantity() - t.getQuantity());
                session.beginTransaction();
                session.persist(item);
                session.getTransaction().commit();
            }

            //saving user credit to database
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();

            //coverting cart to bill and emptying user cart
            cart.setFinal_(true);
            session.beginTransaction();
            session.persist(cart);
            session.getTransaction().commit();
            return true;
        }
        return false;
    }

    public Users getUser(int userID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Criteria profileCriteria = session.createCriteria(Users.class);
        Criterion idCriterion = Restrictions.eq("uid", userID);
        profileCriteria.add(idCriterion);
        return (Users)profileCriteria.list().get(0);
    }

    public boolean addToCart(Transactions t) {
//        throw new UnsupportedOperationException("Not supported yet.");
        if(t.getProducts().getQuantity() < t.getQuantity()){
            return false;
        }
        //reducing product quantity in stock
        Products item = t.getProducts();
        item.setQuantity(item.getQuantity() - t.getQuantity());
        //saving product
        session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        System.out.println("products decreased");
        //saving transaction
        session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        System.out.println("transaction added");
        return true;

    }

    public void removeFromCart(int tid) {
//        throw new UnsupportedOperationException("Not supported yet.");
        //restore quantities to product
        String queryString = "FROM Transactions t WHERE t.tid= :trans_id";
        Query q = session.createQuery(queryString);
        Transactions t = (Transactions)q.list().get(0);
        Products item = t.getProducts();
        item.setQuantity(item.getQuantity() - t.getQuantity());
        session.beginTransaction();
        session.persist(item);
        session.getTransaction().commit();
        System.out.println("products quantity restored");
        //now deleting transaction from database
        String deleteString = "DELETE FROM Transactions t WHERE t.tid=:t_id";
        q = session.createQuery(deleteString);
        q.setInteger("t_id", tid);
        q.executeUpdate();
        session.beginTransaction();
        session.getTransaction().commit();
        System.out.println("transaction deleted");
    }

    public void emptyCart(int cartID) {
//        throw new UnsupportedOperationException("Not supported yet.");
        //finding cart
        String queryString = "FROM Bills b WHERE b.billId=:cid";
        Query q = session.createQuery(queryString);
        q.setInteger("cid", cartID);
        Bills bill = (Bills)q.list().get(0);
        for(Transactions t : (Set<Transactions>)bill.getTransactionses()){
            //deleting transactions
            removeFromCart(t.getTid().intValue());
        }
//        String deleteString = "DELETE FROM Bills b WHERE b.billId=:c_id";
//        q = session.createQuery(deleteString);
//        q.setInteger("c_id", cartID);
//        q.executeUpdate();
    }

    public ArrayList<Categories> getAllCategories() {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Categories";
        Query q = session.createQuery(queryString);
        return (ArrayList<Categories>)q.list();
    }
}
