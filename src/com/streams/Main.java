package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10, Genre.ACTION),
                new Movie("The Godfather: Part II", 50, Genre.ACTION),
                new Movie("The Godfather: Part III", 60, Genre.THRILLER)
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

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        movies.stream()
                .filter(m-> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("peek: " + t))
                .forEach(System.out::println);

        System.out.println(
                movies.stream()
                    .anyMatch(m -> m.getLikes() > 10)
        );

        System.out.println(
                movies.stream()
                        .allMatch(m -> m.getLikes() > 10)
        );

        System.out.println(
                movies.stream()
                        .noneMatch(m -> m.getLikes() > 10)
        );

        System.out.println(
                movies.stream()
                        .findFirst()
                        .get().getTitle()
        );

        System.out.println(
                movies.stream()
                        .max(Comparator.comparing(Movie::getLikes))
                        .get().getTitle()
        );

        Optional<Integer> sum = movies.stream()
            .map(Movie::getLikes)
           .reduce(Integer::sum);

        System.out.println(sum.orElse(0));

        // key (title)
        // value (likes)
        System.out.println(movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes))
        );

        System.out.println(movies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "))
        );

        System.out.println(
                movies.stream()
                        .collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(
                                Movie::getTitle, Collectors.joining(", ")))));

        System.out.println(
            movies.stream()
                    .collect(Collectors.partitioningBy(
                            movie -> movie.getLikes() > 10,
                            Collectors.mapping(Movie::getTitle, Collectors.joining(", ")))));

        IntStream.range(1, 5)
                .forEach(System.out::println);

    }
}
