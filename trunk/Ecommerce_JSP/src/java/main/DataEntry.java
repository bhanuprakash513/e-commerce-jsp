/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import databeans.*;
import databeans.model.AdminService;
import databeans.model.AdminService_Interface;
import databeans.model.UserService;
import databeans.model.UserService_Interface;
import java.util.Set;

/**
 *
 * @author mahmoud
 */
public class DataEntry {
    public static void main(String[] args) {
        AdminService_Interface admin = AdminService.getServiceInstance();
        UserService_Interface usr = UserService.getServiceInstance();
        Users u = usr.getUser(6);
        u.setInterests("football");
        usr.editUser(u);
//        Categories cat = new Categories("England");
//        cat.setId(11);
//        admin.addCategory(cat);
//        Set<Bills> set = usr.getUser(6).getBillses();
//        for(Bills bill : set){
//            System.out.println(bill.isFinal_());
//        }

        //System.out.println(usr.signIn("yousri@msn.com", "123456"));

//        System.out.println("picture is: "+usr.getProductByID(19).getPictureLink());
        //System.out.println(usr.getCartByID(8).getDate());
//        Users user = new Users("Mahmoud Gamal", new Date(88,0,1), "mahmoud.elrefaie@gmail.com",
//                "123", "Engineer", 10000.0, "Science", null);
//        usr.signUp(user);

//        System.out.println(admin.getCategory("egypt").getId());
//        Categories cat = new Categories("books");
//        cat.setId(10);
//        //admin.addProduct(new Products(cat, "7 hats", 100, "none"));
//        admin.addCategory(new Categories("egypt"));
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
