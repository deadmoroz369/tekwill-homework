package com.tekwill.learning.basics.world_population;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the current number of the population on Earth?");
        int integerReadFromKeyboard = scanner.nextInt();
        scanner.nextLine();
        System.out.print("The current number of alive people is:\t" + integerReadFromKeyboard);

        System.out.println("\nWhat is the current growth rate per year?");
        float floatReadFromKeyboard = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("The current growth rate is:\t" + floatReadFromKeyboard + "% per year");

        System.out.println("Where did you get that information from?");
        String stringReadFromKeyboard = scanner.nextLine();
        System.out.println("Thank you!");


    }


}
