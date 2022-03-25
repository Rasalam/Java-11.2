//package ru.netology;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.doReturn;
//
//// class AfishaManagerTest {
//
//@ExtendWith(MockitoExtension.class)
//public class AfishaManagerTestNoEmptyTest {
//
//    @Mock
//    private AfishaManager repository = new AfishaManager();
//    @InjectMocks
//    MovieItem movie1 = new MovieItem(1, "genre1", "movieName1", "imagePosterURL1");
//    MovieItem movie2 = new MovieItem(2, "genre2", "movieName2", "imagePosterURL2");
//    MovieItem movie3 = new MovieItem(3, "genre4", "movieName3", "imagePosterURL3");
//    MovieItem movie4 = new MovieItem(4, "genre1", "movieName4", "imagePosterURL4");
//    MovieItem movie5 = new MovieItem(5, "genre6", "movieName5", "imagePosterURL5");
//    MovieItem movie6 = new MovieItem(6, "genre1", "movieName6", "imagePosterURL6");
//    MovieItem movie7 = new MovieItem(7, "genre2", "movieName7", "imagePosterURL7");
//    MovieItem movie8 = new MovieItem(8, "genre5", "movieName8", "imagePosterURL8");
//    MovieItem movie9 = new MovieItem(9, "genre1", "movieName9", "imagePosterURL9");
//    MovieItem movie10 = new MovieItem(10, "genre3", "movieName10", "imagePosterURL10");
//
//    @Test
//    public void addMovie_Test() {
//        repository.maxLengthMovieList = 11;
//        MovieItem movie11 = new MovieItem(11, "genre3", "movieName11", "imagePosterURL11");
//        MovieItem[] returned = new MovieItem[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
//        doReturn(returned).when(repository).addMovie(movie11);
//        MovieItem[] expected = repository.getMovieList();
//        MovieItem[] actual = new MovieItem[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
//        assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void getMovieList_Test() {
//        repository.maxLengthMovieList = 11;
//        MovieItem[] returned = new MovieItem[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
//        doReturn(returned).when(repository).getMovieList();
//        MovieItem[] expected = repository.getMovieList();
//        MovieItem[] actual = new MovieItem[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void removeById_Test() {
//        int id = 3;
//        repository.maxLengthMovieList = 11;
//        repository.removeById(id);
//        MovieItem[] expected = repository.getMovieList();
//        MovieItem[] actual = new MovieItem[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie2, movie1};
//        assertArrayEquals(expected, actual);
//    }
//}