package com.tekwill.learning.basics.dec7;

public class Recipe {

    static String source_url = "https://www.allrecipes.com/recipe/273221/vegan-chocolate-chip-cookies/";
    final String title;
    final String description;

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static void markAsCooked() {
        System.out.println("Cooooked!");
    }

    public void update() {
        System.out.println("Updated");

    }

    @Override
    public String toString() {
        return "Here is the website to get the vegan recipes from: " + source_url + " Your are about to cook: " + title + "and the ingredients for it are:\n" + description;
    }
}
