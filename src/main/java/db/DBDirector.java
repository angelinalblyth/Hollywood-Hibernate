package db;

import models.Director;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


import java.util.List;

public class DBDirector {

    private static Session session;
    private static Transaction transaction;


    public static List<Film> getListOfFilms(Director director) {
        List<Film> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Director.class);
            cr.createAlias("directors", "director"); // ADDED
            cr.add(Restrictions.eq("director.id", director.getId())); // ADDED
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}

