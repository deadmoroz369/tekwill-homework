package com.tekwill.learning.basics.jan22;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    static boolean numberGuessed;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(11);
        System.out.println("I have thought of a number try and guess it: (1 through 10)");

        while (!numberGuessed) {
            int guessingNumber = scanner.nextInt();
            if (guessingNumber > randomNumber) {
                System.out.println("Too high. Try again.");
            } else if (guessingNumber < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.printf("You guessed right my number was: %d.", randomNumber);
                numberGuessed = true;
            }
        }
    }
}

