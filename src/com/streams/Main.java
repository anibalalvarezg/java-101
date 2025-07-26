package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(n -> System.out.println(n.getTitle()));

        movies.stream()
                .takeWhile(isPopular)
                .forEach(n -> System.out.println(n.getTitle()));

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(n -> System.out.println(n.getTitle()));

    }
}
