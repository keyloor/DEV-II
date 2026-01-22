package com.practica3.Taco;

import java.util.List;

public class Ingredients {
    private Protein protein;
    private Salsa salsa;
    private List<Topping> toppings;

    public Ingredients() {}

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}

