package com.tekwill.learning.basics.non_access_modifiers.cooking;

public class Recipe {

    static String source_url = "https://www.allrecipes.com/recipe/273221/vegan-chocolate-chip-cookies/";
    private final String title;
    private final String description;

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    static char markAsCooked() {
        System.out.println("Cooooked!");
        return 0;
    }

    public char update() {
        System.out.println("Updated");
        return 0;
    }

    @Override
    public String toString() {
        return "Here is the website to get the vegan recipes from: " + source_url + " Your are about to cook: " + title + "and the ingredients for it are:\n" + description;
    }
}
