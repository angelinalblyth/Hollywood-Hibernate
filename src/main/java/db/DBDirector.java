package db;

import models.Director;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class DBDirector {

    private static Session session;
    private static Transaction transaction;


    private static <Film> getListOfFilms(Director director){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> results = null;
        try {
            transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Director.class);
        
        }
    }
}
