package com.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class MovieManager {

    public static Movie[] loadMovies(String fileRoute) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(fileRoute)) {

            return gson.fromJson(reader, Movie[].class);

        } catch (IOException e) {

            return new Movie[0];

        }
    }

    public static boolean saveMovie(String fileRoute, Movie movie) {
        Gson gson = new Gson();

        Movie[] movies = loadMovies(fileRoute);
        movies = addMovie(movies, movie);

        try (FileWriter writer = new FileWriter(fileRoute)) {

            gson.toJson(movies, writer);

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;

        }
    }

    public static Movie[] addMovie(Movie[] movies, Movie newMovie) {

        // Create a new array with one extra space
        Movie[] newArray = new Movie[movies.length + 1];

        // Copy old movies into new array
        for (int i = 0; i < movies.length; i++) {
            newArray[i] = movies[i];
        }

        // Add the new movie at the last position
        newArray[movies.length] = newMovie;

        return newArray;
    }

}
