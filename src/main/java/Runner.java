import db.DBFilm;
import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Director director1 = new Director("Quentin Tarantino", "stylized dialogue");
        DBHelper.save(director1);
        Director director2 = new Director("Martin Scorsese", "long tracking shots");
        DBHelper.save(director2);
        Director director3 = new Director("Wes Anderson", "symmetrical style");
        DBHelper.save(director3);
        Director director4 = new Director("Steven Spielberg", "symmetrical style");
        DBHelper.save(director4);
        Director director5 = new Director("Stanley Kubrick", "close-up of a character's face");
        DBHelper.save(director5);

        Studio studio1 = new Studio("Sony Pictures", 500000);
        DBHelper.save(studio1);
        Studio studio2 = new Studio("Fox", 500000);
        DBHelper.save(studio2);
        Studio studio3 = new Studio("Paramount", 500000);
        DBHelper.save(studio3);

        Film film1 = new Film("Pulp Fiction", Genre.CRIME, Rating.EIGHTEEN, director1, studio1);
        DBHelper.save(film1);
        Film film2 = new Film("Django Unchained", Genre.DRAMA, Rating.EIGHTEEN, director1, studio2);
        DBHelper.save(film2);
        Film film3 = new Film("Fantastic Mr Fox", Genre.ADVENTURE, Rating.PG, director3, studio3);
        DBHelper.save(film3);
        Film film4 = new Film("Isle of Dogs", Genre.DRAMA, Rating.PG, director3, studio1);
        DBHelper.save(film4);
        Film film5 = new Film("The Departed", Genre.CRIME, Rating.EIGHTEEN, director2, studio2);
        DBHelper.save(film5);
        Film film6 = new Film("Shutter Island", Genre.THRILLER, Rating.EIGHTEEN, director2, studio3);
        DBHelper.save(film6);
        Film film7 = new Film("Jurassic Park", Genre.FANTASY, Rating.FIFTHTEEN, director4, studio1);
        DBHelper.save(film7);
        Film film8 = new Film("Ready Player One", Genre.FANTASY, Rating.TWELVE, director4, studio3);
        DBHelper.save(film8);

        Actor actor1 = new Actor("John Travolta", 15000);
        DBHelper.save(actor1);
        Actor actor2 = new Actor("Jamie Foxx", 15000);
        DBHelper.save(actor2);
        Actor actor3 = new Actor("Leonardo DiCaprio", 15000);
        DBHelper.save(actor3);
        Actor actor4 = new Actor("Bill Murray", 15000);
        DBHelper.save(actor4);
        Actor actor5 = new Actor("Jeff Goldblum", 15000);
        DBHelper.save(actor5);

        Actress actress1 = new Actress("Uma Thurman", 15000);
        DBHelper.save(actress1);
        Actress actress2 = new Actress("Meryl Streep", 15000);
        DBHelper.save(actress2);
        Actress actress3 = new Actress("Michelle Williams", 15000);
        DBHelper.save(actress3);
        Actress actress4 = new Actress("Scarlett Johansson", 15000);
        DBHelper.save(actress4);

        List<Film> allFilms = DBHelper.getAll(Film.class);
        List<Director> allDirectors = DBHelper.getAll(Director.class);
        List<Actor> allActors = DBHelper.getAll(Actor.class);
        List<Actress> allActresses = DBHelper.getAll(Actress.class);

        DBFilm.addStarToFilm(actor1, film1);
        DBFilm.addStarToFilm(actress1, film1);

        List<Star> filmsStarIsIn = DBFilm.getStarsOfFilms(film1);

    }
}
