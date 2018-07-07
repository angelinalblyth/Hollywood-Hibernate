package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="films")
public class Film {

    private int id;
    private String title;
    private Genre genre;//Enum?
    private Rating rating; //Enum?
    private Director director;
    private Studio studio;

    public Film() {
    }

    public Film(String title, Genre genre, Rating rating, Director director, Studio studio) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.director = director;
        this.studio = studio;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Enumerated(value = EnumType.STRING)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Enumerated(value = EnumType.STRING)
    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @ManyToOne
    @JoinColumn(name="director_id", nullable=false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @ManyToOne
    @JoinColumn(name="studio_id", nullable=false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
