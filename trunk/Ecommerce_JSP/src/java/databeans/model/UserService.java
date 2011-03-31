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
import org.hibernate.criterion.Order;
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
 *
 * @author mahmoud
 */
public class UserService implements UserService_Interface{
    /**
     * used to commit transactions
     */
    private Session session;
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
    public static UserService createServiceInstance(){
        return service;
    }

    public boolean signIn(String userName, String pwd) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Criteria loginCriteria = session.createCriteria(Users.class);
        Criterion nameCriterion = Restrictions.eq("name", userName);
        Criterion passwordCriterion = Restrictions.eq("password", pwd);
        loginCriteria.add(nameCriterion).add(passwordCriterion);
        List<Users> result = (List<Users>)loginCriteria.list();
        if(result.isEmpty()){
            System.out.println("login failed");
            return false;
        }

        //formatting system time to be used
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(cal.getTime());
        //creating cart of the user
        Bills cart = new Bills(result.get(0), new Date(sdf.format(cal.getTime())), 0, false);
        session.beginTransaction();
        session.persist(cart);
        session.getTransaction().commit();
        
        System.out.println("login successeded");
        return true;
    }

    public void signUp(Users user) {
        //throw new UnsupportedOperationException("Not supported yet.");
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
        String queryString = "FROM Categories c WHERE c.id=:cat_id";
        Query q = session.createQuery(queryString);
        q.setInteger("cat_id", catID);
        Categories cat = (Categories)(q.list().get(0));
        return cat.getProductses();
    }

    public Set<Transactions> viewMyCart(int userID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Bills b WHERE b.user_id=:uid";
        Query q = session.createQuery(queryString);
        q.setInteger("uid", userID);
        List<Bills> bills = (List<Bills>)q.list();
        for(Bills bill : bills){
            if(!bill.isFinal_()){
                return bill.getTransactionses();
            }
        }
        return null;
    }

    public boolean submitMyCart(int cartID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //reducing user credit
        String queryString = "FROM Bills b WHERE b.billId=:cid";
        Query q = session.createQuery(queryString);
        q.setInteger("cid", cartID);
        Bills cart = (Bills)q.list().get(0);

        Users user = cart.getUsers();

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

    public Users showMyProfile(int userID) {
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
        session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        return true;

    }

    public void removeFromCart(int tid) {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "DELETE FROM Transactions t WHERE t.tid=:t_id";
        Query q = session.createQuery(queryString);
        q.setInteger("t_id", tid);
        q.executeUpdate();
    }

    public void emptyCart(int cartID) {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "DELETE FROM Bills b WHERE b.billId=:c_id";
        Query q = session.createQuery(queryString);
        q.setInteger("c_id", cartID);
        q.executeUpdate();
    }

    public ArrayList<Categories> getAllCategories() {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Categories";
        Query q = session.createQuery(queryString);
        return (ArrayList<Categories>)q.list();
    }
}
