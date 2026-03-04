package Lesson16.SortClass;

public class Movie implements Comparable<Movie> {

    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int compareTo(Movie other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + director;

    }
}