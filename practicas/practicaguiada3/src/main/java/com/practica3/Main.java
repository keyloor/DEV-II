package com.practica3;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // Crear objeto Person
        Person person = new Person("Keylor", 18, true, 1);

        // Serializar a JSON en memoria
        String json = gson.toJson(person);
        System.out.println(json);

        // Escribir un objeto Person en un archivo JSON
        /*
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
        */

        // Leer un objeto Person desde el archivo JSON
        /*
        try (FileReader reader = new FileReader("person.json")) {
            Person person2 = gson.fromJson(reader, Person.class);
            System.out.println(person2);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        */

        // Leer una lista de Person desde un archivo JSON
        try (FileReader reader = new FileReader("person.json")) {

            Type type = new TypeToken<ArrayList<Person>>() {}.getType();
            List<Person> people = gson.fromJson(reader, type);

            for (Person p : people) {
                System.out.println(p.getName());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
