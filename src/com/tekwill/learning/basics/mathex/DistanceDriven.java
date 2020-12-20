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


}

