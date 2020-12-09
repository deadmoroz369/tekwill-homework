package com.tekwill.learning.basics.non_access_modifiers.cooking;

public class RecipeDemo {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("Chocolate Chip Cookies", "1/2 cup coconut oil\n1 cup brown sugar\n1/4 almond milk\n1 tbsp vanilla extract\n2 cups all-purpose flour\n1 tsp baking soda\n1 tsp baking powder\n1/2 tsp salt\n1 cup vegan chocolate chips");
        System.out.println(r1);
        r1.update();
        Recipe.markAsCooked();

    }

}
