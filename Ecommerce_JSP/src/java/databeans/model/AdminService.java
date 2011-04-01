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
//        String queryString = "FROM Categories WHERE id=:catID";
//        Query q = session.createQuery(queryString);
//        q.setInteger("catID", cat.getId());
//        Categories cat2 = (Categories)q.list().get(0);
//        cat2.setName(cat.getName());
        session.beginTransaction();
        session.saveOrUpdate(cat);
        session.getTransaction().commit();
        System.out.println("category added");
    }

    public void addProduct(Products item) {
//        throw new UnsupportedOperationException("Not supported yet.");
        session.beginTransaction();
        session.saveOrUpdate(item);
        session.getTransaction().commit();
        System.out.println("product added");
    }

    public ArrayList<Users> viewAllUsers() {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Users";
        Query q = session.createQuery(queryString);
        return (ArrayList<Users>)q.list();
    }

    public void modifyProduct(Products product) {
//        throw new UnsupportedOperationException("Not supported yet.");
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();
        
    }

    public Users getUser(int userID) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Users u WHERE uid=:u_id";
        Query q = session.createQuery(queryString);
        q.setInteger("u_id", userID);
        return (Users)q.list().get(0);
    }

    public Categories getCategory(String catName) {
//        throw new UnsupportedOperationException("Not supported yet.");
        String queryString = "FROM Categories WHERE name=:catname";
        Query q = session.createQuery(queryString);
        q.setString("catname", catName);
        return (Categories)q.list().get(0);
    }

}
