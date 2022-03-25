package ru.netology;

public class AfishaManager {
    int maxLengthMovieList;
    private AfishaRepository repository = new AfishaRepository();

    public AfishaManager() {

    }

    public AfishaManager(int maxLengthMovieList) {
        this.maxLengthMovieList = maxLengthMovieList;
        this.repository = new AfishaRepository();

    }

    public void addMovie(MovieItem item) {
        repository.save(item);
    }


    public MovieItem[] getMovieList() {
        int resultLength;
        MovieItem[] items = repository.findAll();
        if (items.length > maxLengthMovieList) {
            resultLength = maxLengthMovieList;
        } else resultLength = items.length;
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
