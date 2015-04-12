/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.model.BIM1stSem;
import com.model.BIM2ndSem;
import com.model.BIM3rdSem;
import com.model.BIM4thSem;
import com.model.BIM5thSem;
import com.model.BIM6thSem;
import com.model.BIM7thSem;
import com.model.BIM8thSem;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author AAAD3
 */
public class UploadnDownloaddao {

    public void insertBIM1stSem(BIM1stSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM2ndSem(BIM2ndSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM3rdSem(BIM3rdSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM4thSem(BIM4thSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM5thSem(BIM5thSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM6thSem(BIM6thSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM7thSem(BIM7thSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertBIM8thSem(BIM8thSem b1) {
        try {
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            s.save(b1);
            s.getTransaction().commit();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<BIM1stSem> selectBIM1stSem() {
        try {
            List<BIM1stSem> l = new ArrayList<BIM1stSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM1stSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM2ndSem> selectBIM2ndSem() {
        try {
            List<BIM2ndSem> l = new ArrayList<BIM2ndSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM2ndSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM3rdSem> selectBIM3rdSem() {
        try {
            List<BIM3rdSem> l = new ArrayList<BIM3rdSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM3rdSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM4thSem> selectBIM4thSem() {
        try {
            List<BIM4thSem> l = new ArrayList<BIM4thSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM4thSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM5thSem> selectBIM5thSem() {
        try {
            List<BIM5thSem> l = new ArrayList<BIM5thSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM5thSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM6thSem> selectBIM6thSem() {
        try {
            List<BIM6thSem> l = new ArrayList<BIM6thSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM6thSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM7thSem> selectBIM7thSem() {
        try {
            List<BIM7thSem> l = new ArrayList<BIM7thSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM7thSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BIM8thSem> selectBIM8thSem() {
        try {
            List<BIM8thSem> l = new ArrayList<BIM8thSem>();
            SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Query q = s.createQuery("from BIM8thSem");
            l = q.list();
            s.getTransaction().commit();
            s.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
  
}
