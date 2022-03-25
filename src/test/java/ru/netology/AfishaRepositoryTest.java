package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {

    AfishaRepository movie = new AfishaRepository();
    MovieItem movie1 = new MovieItem(1, "genre1", "movieName1", "imagePosterURL1");
    MovieItem movie2 = new MovieItem(2, "genre2", "movieName2", "imagePosterURL2");
    MovieItem movie3 = new MovieItem(3, "genre4", "movieName3", "imagePosterURL3");
    MovieItem movie4 = new MovieItem(4, "genre1", "movieName4", "imagePosterURL4");
    MovieItem movie5 = new MovieItem(5, "genre6", "movieName5", "imagePosterURL5");
    MovieItem movie6 = new MovieItem(6, "genre1", "movieName6", "imagePosterURL6");
    MovieItem movie7 = new MovieItem(7, "genre2", "movieName7", "imagePosterURL7");
    MovieItem movie8 = new MovieItem(8, "genre5", "movieName8", "imagePosterURL8");
    MovieItem movie9 = new MovieItem(9, "genre1", "movieName9", "imagePosterURL9");
    MovieItem movie10 = new MovieItem(10, "genre3", "movieName10", "imagePosterURL10");


    @BeforeEach
    public void prepareManager() {
        movie.save(movie1);
        movie.save(movie2);
        movie.save(movie3);
        movie.save(movie4);
        movie.save(movie5);
        movie.save(movie6);
        movie.save(movie7);
        movie.save(movie8);
        movie.save(movie9);
        movie.save(movie10);
    }

    @Test
    public void findAll_Test() {
        MovieItem[] expected = movie.findAll();
        MovieItem[] actual = new MovieItem[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void save_Test() {
        MovieItem movie11 = new MovieItem(11, "genre3", "movieName11", "imagePosterURL11");
        movie.save(movie11);
        MovieItem[] expected = movie.findAll();
        MovieItem[] actual = new MovieItem[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findById_Test() {
        int id = 0;
        MovieItem[] expected = movie.findById(id);
        MovieItem[] actual = new MovieItem[]{null};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void removeById_Test() {
        int id = 3;
        MovieItem[] expected = movie.removeById(id);
        MovieItem[] actual = new MovieItem[]{movie1, movie2, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void removeAll_Test() {
        MovieItem[] expected = movie.removeAll();
        MovieItem[] actual = new MovieItem[]{};
        assertArrayEquals(expected, actual);
    }

}
