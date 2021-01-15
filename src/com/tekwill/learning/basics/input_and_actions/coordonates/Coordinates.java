package com.tekwill.learning.basics.input_and_actions.coordonates;

import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {

        double latitude;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Let's find out your location!\n" +
                "First enter the degrees: ");
        double degrees = scanner.nextDouble();

        System.out.print("Now, enter the minutes of arc: ");
        double minutes = scanner.nextDouble();

        System.out.print("Finally, enter the seconds of arc: ");
        double seconds = scanner.nextDouble();

        latitude = degrees + minutes / 60 + seconds / 3600;

        System.out.printf(degrees + " degrees, " + minutes + " minutes, " + seconds + " seconds = %.4f%n", latitude);


    }
}


