package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

public class MoviePosterManagerTest {

    MoviePoster one = new MoviePoster(1, "bloodshot", "action movie");
    MoviePoster two = new MoviePoster(2, "forward", "cartoon");
    MoviePoster three = new MoviePoster(3, "hotel Belgrade ", "comedy");
    MoviePoster four = new MoviePoster(4, "The Gentlemen", "action movie");
    MoviePoster five = new MoviePoster(5, "The Invisible Man", "horror");
    MoviePoster six = new MoviePoster(6, "Trolls. World tour", "cartoon");
    MoviePoster seven = new MoviePoster(7, "Number one", "comedy");
    MoviePoster eight = new MoviePoster(8, "Young man", "comedy");
    MoviePoster nine = new MoviePoster(9, "My Rembrandt", "documentary");
    MoviePoster ten = new MoviePoster(10, "Nika", "drama");

    @Test
    public void findLastRentalMovies() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        MoviePoster[] actual = manager.findAll();
        MoviePoster[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void findAllMovies() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {ten, nine, eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findSeveralMovies() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {ten, nine, eight, seven, six};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllRentalMovies() {
        MoviePosterManager manager = new MoviePosterManager(100);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {ten, nine, eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(actual, expected);
    }

}
