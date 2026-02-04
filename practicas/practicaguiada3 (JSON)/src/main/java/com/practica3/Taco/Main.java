package com.practica3.Taco;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("tacos.json")) {
            Type tacoListType = new TypeToken<List<Taco>>() {}.getType();
            List<Taco> tacos = gson.fromJson(reader, tacoListType);

            for (Taco taco : tacos) {
                System.out.println(taco.getName());
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
