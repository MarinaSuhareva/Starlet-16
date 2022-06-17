package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class MoviePosterManager {
    private MoviePoster[] items = new MoviePoster[0];
    private int resultLength = 10;

    public MoviePosterManager() {

    }

    public MoviePosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(MoviePoster item) {
        MoviePoster[] tmp = new MoviePoster[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = item;
        items = tmp;
    }

    public MoviePoster[] findAll() {
        return items;
    }

    public MoviePoster[] findLast() {
        if (items.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = items.length;
        }
        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

 /* ??? resultLength;
        if ??? {
            resultLength = ???
        } else {
            resultLength = ???
        }
  ??? result = new ???[resultLength];
        for (???) {
            // заполняем result из массива что лежит в поле
            // в обратном порядке
        }
...
    }*/

