package com.assignment.netflix;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://10.51.10.111:8080/movies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>(){});
        List<Movie> movies = response.getBody();

        for(Movie Movie : movies){
            System.out.println(Movie.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        Movie Movie = restTemplate.getForObject(
                "http://10.51.10.111:8080/universities/2",
                Movie.class);
        System.out.println(Movie.toString());

        System.err.println("Creating(POST)______________________________");

        Movie newMovie = new Movie("Logan");
        Movie createdMovie = restTemplate.postForObject(
                "http://10.51.10.111:8080/universities",
                newMovie, Movie.class);
        System.out.println(createdMovie.toString());

        System.err.println("____________________________________");
        String createCategoryUrl = "http://10.51.10.111:8080/universities/"
                +createdMovie.getId()+"/Categorys";

        Category newCategory = new Category("Action");
        Category createdCategory = restTemplate.postForObject(
                createCategoryUrl,
                newCategory, Category.class);
        System.out.println(createdCategory.toString());

    }
}