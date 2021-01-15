package com.tekwill.learning.basics.input_and_actions.distance_traveled;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in miles.");
        int distance = scanner.nextInt();
        System.out.println("Now enter time in hours.");
        int time = scanner.nextInt();
        System.out.println("Hours   Distance Traveled");
        System.out.println("-------------------------");

        for (int i = 1; i <= time; i++) {
            System.out.println(i + "               " + distance * i);
        }

    }
}
