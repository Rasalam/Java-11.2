package ru.netology;

public class AfishaRepository {
    private MovieItem[] items = new MovieItem[0];

    public AfishaRepository() {

    }

    public MovieItem[] findAll() {
        return items;
    }


    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findById(int id) {
        MovieItem[] findMovie = new MovieItem[1];
        int index = 0;
        for (MovieItem item : items)
            if (item.getId() == id) {
                findMovie[index] = item;
                index++;
            }
        return findMovie;
    }

    public MovieItem[] removeById(int id) {
        int length = items.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
        return items;
    }

    public MovieItem[] removeAll() {
        return new MovieItem[0];
    }

}
