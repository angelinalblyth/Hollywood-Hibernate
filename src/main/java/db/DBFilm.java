package db;

import models.Film;
import models.Star;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFilm {

    private static Transaction transaction;
    private static Session session;

    public static void addStarToFilm(Star star, Film film){
        star.addFilm(film);
        film.addStar(star);
        DBHelper.update(film);
    }

    public static List<Star> getStarsOfFilms(Film film) {
        List<Star> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Star.class);
            cr.createAlias("films", "film"); // ADDED
            cr.add(Restrictions.eq("film.id", film.getId())); // ADDED
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static List<Film> getFilmsByGenre(){

    }
}
