/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databeans.model;

import databeans.Categories;
import databeans.Products;
import databeans.Users;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *business logic of admin jobs implementation
 * @author mahmoud
 */
public class AdminService implements AdminService_Interface{
    private Session session;
    private static AdminService service = new AdminService();
    private AdminService() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
    }
    public static AdminService getServiceInstance(){
        return service;
    }

    public void addCategory(Categories cat) {
//        throw new UnsupportedOperationException("Not supported yet.");
        session.beginTransaction();
        session.persist(cat);
        session.getTransaction().commit();
        System.out.println("category added");
    }

    public void addProduct(Products item) {
//        throw new UnsupportedOperationException("Not supported yet.");
        session.beginTransaction();
        session.persist(item);
        session.getTransaction().commit();
    }

    public ArrayList<Users> viewAllUsers() {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM users";
        Query q = session.createQuery(queryString);
        return (ArrayList<Users>)q.list();
    }

    public void modifyProduct(Products product) {
//        throw new UnsupportedOperationException("Not supported yet.");
        session.beginTransaction();
        session.persist(product);
        session.getTransaction().commit();
        
    }

    public Users getUser(int userID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM users u WHERE uid=:u_id";
        Query q = session.createQuery(queryString);
        return (Users)q.list().get(0);
    }

}
