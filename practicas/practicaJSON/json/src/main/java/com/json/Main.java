package com.json;

public class Main {

    public static void main(String[] args) {

        String route = "practicas/practicaJSON/json/src/main/resources/movies.json";

        Movie dune = new Movie("Dune", "Vilenu", 2022, 8.0);

        MovieManager.saveMovie(route, dune);

        Movie[] movies = MovieManager.loadMovies(route);

        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }
}
