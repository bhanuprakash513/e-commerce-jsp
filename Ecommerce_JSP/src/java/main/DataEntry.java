/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import databeans.*;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
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
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Categories cat = new Categories("Planes");

        Products prdct = new Products(cat, "Phantom", 10000, "no image");
        Set set = cat.getProductses();
        set.add(prdct);
        cat.setProductses(set);
//        cat.setProductses();
        session.beginTransaction();
        session.persist(cat);
        session.getTransaction().commit();

//        session.beginTransaction();
//        session.persist(prdct);
//        session.getTransaction().commit();

        System.out.println("transaction submitted");
    }

}
