/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import databeans.*;
import databeans.model.AdminService;
import databeans.model.AdminService_Interface;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mahmoud
 */
public class DataEntry {
    public static void main(String[] args) {
        AdminService_Interface admin = AdminService.getServiceInstance();
        Categories cat = new Categories("books");
        cat.setId(10);
        //admin.addProduct(new Products(cat, "7 hats", 100, "none"));
        admin.addCategory(new Categories("egypt"));
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        Session session = factory.openSession();
//        Categories cat = new Categories("Planes");
//
//        Products prdct = new Products(cat, "Phantom", 10000, "no image");
//        Set set = cat.getProductses();
//        set.add(prdct);
//        cat.setProductses(set);
////        Users user = new Users("mahmoud", "m.el_refaie@yahoo.com", "123");
////        user.setDob(new Date(88, 0, 1));
////        user.setInterests("basketball");
////        user.setJob("Engineer");
//        String queryString = "FROM Users u WHERE u.uid=:user_id";
//        Query q = session.createQuery(queryString);
//        q.setInteger("user_id", 1);
//        Users user = (Users)q.list().get(0);
//        user.setDob(new Date(88, 0, 1));
////        cat.setProductses();
//        session.beginTransaction();
//        session.persist(user);
//        session.getTransaction().commit();
//
////        session.beginTransaction();
////        session.persist(prdct);
////        session.getTransaction().commit();
//
//        System.out.println("transaction submitted");
    }

}
