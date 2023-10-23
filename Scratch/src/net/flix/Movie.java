package net.flix;

public class Movie {
    // fields or instance variables ("properties" or "attributes")
    private String title; // must be supported in instances, constructors, toString(), and getter/setter
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - these get called when clients say "new"
    public Movie(String title) {
        setTitle(title); // delegate to setter for validation/conversion it might do
    }

    // 2-arg constructor - used in a situation where you only know the title and genre
    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title); // delegate to 1-arg String ctor for title
        setReleaseYear(releaseYear); // handle releaseYear myself, by delegating to it setter
    }

    // 3-arg constructor
    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear); //delegate to ctor 2-arg constructor for title, releaseYear
        setRevenue(revenue); // handle revenue myself, by delegating to its setter
    }

    // 5-arg constructor
    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue); // these are common with the other constructors listed above
        setRating(rating);
        setGenre(genre);
    }

    // business "methods" ("actions" or "functions")
    // pause(), play(), rewind(), fasForward(), skipTo()

    // accessor "methods" - provide "controlled access" to the object's field - get/set
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //toSting()
    // TODO: get this right, so that if revenue is null, you use %s, and if not, go with %,.2f
    public String toString() {
        return String.format("Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

        /* return "Movie: title=" + getTitle() +
         *       ", releaseYear=" + getReleaseYear() +
         *       ", revenue=" + getRevenue() +
         *       ", rating=" + getRating() +
         *       ", genre=" + getGenre();
         */
    }
}