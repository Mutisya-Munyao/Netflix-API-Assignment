package com.assignment.netflix;

public class Movie {

    private Long id;
    private String movieName;

    public Movie(String movieName){
        this.movieName = movieName;
    }

    private Movie () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
