package com.tekwill.learning.basics.input_and_actions.speed_of_sound_in_specific_environment;

import java.util.Scanner;

public class TheSpeedOfSound {
    public static final double SPEED_OF_SOUND_IN_AIR_TRAVELS = 1100;
    public static final double SPEED_OF_SOUND_IN_WATER_TRAVELS = 4900;
    public static final double SPEED_OF_SOUND_IN_STEEL_TRAVELS = 16400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, Enter the Distance that a sound wave will travel: ");
        double distance = scanner.nextDouble();
        System.out.println("Now choose between the three environments:\na)Air\nb)Water\nc)Steel");
        String environment = scanner.next();
        switch (environment) {
            case "a":
                System.out.printf("You have chosen Air as environment.\nNow the time that sound wave travels through Air is: %.2f seconds", distance / SPEED_OF_SOUND_IN_AIR_TRAVELS);
                break;
            case "b":
                System.out.printf("You have chosen Water as environment.\nNow the time that sound wave travels through Water is: %.2f seconds", distance / SPEED_OF_SOUND_IN_WATER_TRAVELS);
                break;
            case "c":
                System.out.printf("You have chosen Steel as environment.\nNow the time that sound wave travels through Steel is: %.2f seconds", distance / SPEED_OF_SOUND_IN_STEEL_TRAVELS);
                break;
            default:
                System.out.println("No such option!");
        }
    }
}

