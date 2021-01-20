package com.tekwill.learning.basics.jan15;

import java.util.Random;
import java.util.Scanner;

public class ESP {

    public static String color;
    public static int guessed;
    public static int repeat;

    public static String getUserAnswer() {
        System.out.println((repeat + 1) + ". Pick a color and type it: Red, Green, Blue, Orange and Yellow.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static String checkAiChoice(int aiChoice) {
        switch (aiChoice) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Orange";
                break;
            case 4:
                color = "Yellow";
        }
        System.out.println("Computer choice was: " + color);
        return color;
    }

    public static void checkIfGuessed(String userGuess, String color) {
        if (userGuess.equalsIgnoreCase(color)) {
            guessed++;
        }
    }

    public static void randomizerOfChoice() {
        Random random = new Random();
        int computerChoice = random.nextInt(5);

        checkIfGuessed(getUserAnswer(), checkAiChoice(computerChoice));
    }

    public static void beginTheGame() {
        for (; repeat < 10; repeat++) {

            randomizerOfChoice();

        }
        System.out.printf("     *  *  *  GAME OVER  *  *  *\n\n  You guessed %d times out of 10", guessed);
    }

    public static void main(String[] args) {
        beginTheGame();
    }
}


