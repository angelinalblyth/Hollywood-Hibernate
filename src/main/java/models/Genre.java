package models;

public enum Genre {
    CRIME("Crime"),
    DRAMA("Drama"),
    ADVENTURE("Adventure"),
    THRILLER("Thriller"),
    FANTASY("Fantasy");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

}
