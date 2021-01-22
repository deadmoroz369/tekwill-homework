package com.tekwill.learning.basics.jan15;

import java.util.Random;
import java.util.Scanner;


public class RPS {
    public static void letsPlay() {
        beginGame();
        getAiAnswer();
        compareTheInputs();


    }

    public static void beginGame() {
        System.out.println("Let's Play a game of Rock, Paper , Scissors!\nPress [Y] to Play or [N] for a Goodbye:");
        Scanner scanner = new Scanner(System.in);
        String playOrNot = scanner.nextLine();
        if (playOrNot.equalsIgnoreCase("Y")) {
            System.out.println("Choose between:\na)Rock\nb)Paper\nc)Scissors");
        } else {
            System.out.print("Goodbye!");
            System.exit(0);


        }
    }

    public static String getHumanPlayerAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static int getAiAnswer() {
        Random random = new Random();
        return random.nextInt(3);// random range 0 to 2


    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose again we both have the same! Or quit and loose (press [q] to quit): ");
        String playAgainValue = scanner.nextLine();
        if (!playAgainValue.equalsIgnoreCase("Q")) {
            compareTheInputs();
        } else {
            System.out.println("You lost without a choice!Goodbye");
        }

    }

    public static void tryAgain() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Rematch me! Or press [q] to quit: ");
        String tryAgainValue = scanner.next();
        if (!tryAgainValue.equalsIgnoreCase("Q")) {
            compareTheInputs();
        } else {
            System.out.println("Goodbye!");
        }


    }


    public static void compareTheInputs() {
        String humanChoice = getHumanPlayerAnswer();
        int aiChoice = getAiAnswer();
        if (aiChoice == 0 && humanChoice.equalsIgnoreCase("A") || aiChoice == 1 && humanChoice.equalsIgnoreCase("B") || aiChoice == 2 && humanChoice.equalsIgnoreCase("C")) {
            playAgain();
        } else if (aiChoice == 0 && humanChoice.equalsIgnoreCase("C")) {
            System.out.print(Answers.ai1);
            tryAgain();
        } else if (aiChoice == 1 && humanChoice.equalsIgnoreCase("A")) {
            System.out.print(Answers.ai2);
            tryAgain();
        } else if (aiChoice == 2 && humanChoice.equalsIgnoreCase("B")) {
            System.out.print(Answers.ai3);
            tryAgain();
        } else if (humanChoice.equalsIgnoreCase("A") && aiChoice == 2) {
            System.out.print(Answers.h1);
        } else if (humanChoice.equalsIgnoreCase("B") && aiChoice == 0) {
            System.out.print(Answers.h2);
        } else if (humanChoice.equalsIgnoreCase("C") && aiChoice == 1) {
            System.out.print(Answers.h3);
        } else {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        letsPlay();
    }
}
