package org.example.service;

import org.example.config.HibernateConfig;
import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public void save(User user) {
        try {
            SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
          Session session= sessionFactory.openSession();
            session.beginTransaction();
            session.persist(user);//save
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
            System.out.println("object USER successfully saved");
        } catch (SessionException e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<User> findAll(){
List<User> users=new ArrayList<>();
try{
    SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
Session session= sessionFactory.openSession();
session.beginTransaction();
users=session.createQuery("from User",User.class).getResultList();
session.close();
    System.out.println("Object USER successfully found");
}catch (SessionException e){
    System.out.println(e.getMessage());
}return users;
    }

}
