package models;

public enum Rating {
    TWELVE(12),
    FIFTHTEEN(15),
    PG(1),
    EIGHTEEN(18);

    private int rating;

    Rating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
