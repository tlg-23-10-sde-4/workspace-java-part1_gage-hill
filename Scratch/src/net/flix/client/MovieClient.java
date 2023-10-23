package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

// movie "object"
class MovieClient {

    public static void main(String[] args) {
        // no argument constructor
        Movie movie1 = new Movie("Akira");
        movie1.setReleaseYear(1988); // individual setter call
        movie1.setRevenue(240_000_000.0);
        movie1.setRating(Rating.R);
        movie1.setGenre(Genre.SPORTS_ROMANCE);
        System.out.println(movie1); // toString() is automatically called

        // 5-arg constructor
        Movie movie2 = new Movie("Iron Man", 2008, 29_500_000_000.0, Rating.PG_13, Genre.ACTION);
        System.out.println(movie2);

        Movie movie3 = new Movie("Jay 2 Jay", Genre.WESTERN);
        System.out.println(movie3);
    }
}