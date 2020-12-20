package com.tekwill.learning.basics.mathex;

import java.util.Scanner;

public class DistanceDriven {

    public static final String USA = "U.S.";
    public static final String EU = "Europe";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you live in?\nU.S. or Europe");
        String whereAreYouFrom = scanner.nextLine();
        if (whereAreYouFrom.equals(USA)) {
            System.out.println("Enter the distance in miles:");
            float miles = scanner.nextFloat();
            System.out.println("Now enter the total amount of gallons you have used:");
            float gallons = scanner.nextFloat();
            System.out.printf("%s%.1f%s", "You are driving:", (miles / gallons), " MPG");

        } else {
            System.out.println("Enter the distance in km:");
            float km = scanner.nextFloat();
            System.out.println("Now enter the total amount of liters you have used:");
            float liters = scanner.nextFloat();
            System.out.printf("%s%.1f%s", "You are driving: ", (km / liters), " L/km");

        }


    }




/* public static void main(String[] args) {
        System.out.println("Let's do a " + TOPIC_1 + "\nPress Enter to Continue!");
        Scanner scanner = new Scanner(System.in);
        String enterFromKeyboard = scanner.nextLine();
        System.out.println("Question #1:\n" + LEVEL_1_QUESTION_1_TOPIC_1);
        System.out.println("a)" + LEVEL_1_Q1_ANSWER_1_TOPIC_1 + "\n" + "b)" + LEVEL_1_Q1_ANSWER_2_TOPIC_1 + "\n" + "c)" + LEVEL_1_Q1_ANSWER_3_TOPIC_1 + "\n" + "d)" + LEVEL_1_Q1_CORRECT_ANSWER_TOPIC_1);
        String stringYourAnswer = scanner.nextLine();
        if (stringYourAnswer.equals(LEVEL_1_Q1_SHORT_ANSWER_D_TOPIC_1)) {
            System.out.println("Correct!");
    1. Ask a prompt for how many miles you drove and how many gallons you have used
   2. Having the prompts will calculate and print how many MPG the car's driven!
   3. If you prefer can make the EU style where Liters and km are used!
   4. OR you can use if else statement if you like --> the prompt asks which style you want and depending on that prints out

 */


}

