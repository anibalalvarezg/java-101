package com.streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("The Godfather: Part II", 11),
                new Movie("The Godfather: Part III", 112)
        );

        int count = 0;
        for (var movie: movies)
            if (movie.getLikes() > 10)
                count++;

        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        System.out.println(count);
        System.out.println(count2);

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(n -> System.out.println(n));
    }
}
