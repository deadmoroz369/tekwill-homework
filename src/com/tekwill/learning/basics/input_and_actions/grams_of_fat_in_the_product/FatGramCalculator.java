package com.tekwill.learning.basics.input_and_actions.grams_of_fat_in_the_product;
//input and action_ calculate

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        String high = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String product = scanner.nextLine();
        System.out.print("Enter the number of calories per serving: ");
        float calories = scanner.nextFloat();
        System.out.print("Now enter how many grams per serving you are getting in fats from the product: ");
        float fats = scanner.nextFloat();
        System.out.print("Now enter the net weight of the product: ");
        float net = scanner.nextFloat();
        System.out.print("And finally enter how many grams of the product equals to one serving: ");
        float serving = scanner.nextFloat();
        float FATS_TO_CALORIES = fats * 9.0F;
        float FATS_IN_PRODUCT = (FATS_TO_CALORIES / calories) * 100;
        if (FATS_IN_PRODUCT > 30) {
            high = "which means that's filling up!";
        } else {
            high = "which means it is low in fats!";
        }
        float TOTAL_SERVINGS = net / serving;
        float TOTAL_CALORIES = TOTAL_SERVINGS * calories;
        System.out.printf("%s%s%s%s%s%.2f%s%s%s%.0f%s%s%s%.0f%s", "Your desired product is: ", product, "\nThe ", product, " contains: ", FATS_IN_PRODUCT, " % of fats ", high, "\nTotal amount of servings is: ", TOTAL_SERVINGS, "\nTotal amount of calories of the ", product, " is: ", TOTAL_CALORIES, " calories.\nEnjoy!");
    }


}
/*
Example with low amount of fat
product : Apple
cal/serving : 52 cal
fats/serving : 0.2 g
net weight : 100 g
serving : 100 g
Example with high amount of fat
product: Peanut Butter
cal/serving: 180 cal
fats/serving : 15.6 g
net weight : 454 g
serving : 32 g
 */