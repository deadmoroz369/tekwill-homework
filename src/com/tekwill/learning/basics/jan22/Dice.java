package com.tekwill.learning.basics.jan22;


import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random random = new Random();
        int userWins = 0;
        int aiWins = 0;
        int noWinner = 0;

        for (int i = 1; i < 11; i++) {
            int userDice = random.nextInt(6) + 1;
            int aiDice = random.nextInt(6) + 1;
            if (userDice > aiDice) {
                userWins += 1;
            } else if (aiDice > userDice) {
                aiWins += 1;
            } else {
                noWinner += 1;
            }

        }
        System.out.printf("You won: %d times%nI won: %d times%nA Tie happened: %d times%n", userWins, aiWins, noWinner);
        if (userWins > aiWins) {
            System.out.println("You are the grandmaster of Dice Rolling, congrats!");
        } else if (aiWins > userWins) {
            System.out.println("Behold as I am the grandmaster of Dice Rolling!");
        } else if (noWinner == 10) {
            System.out.println("I doubt this will ever happen!");
        } else if (aiWins == userWins) {
            System.out.println("We should play one last time to decide who is the winner!");
            for (int i = 1; i < 2; i++) {
                int finalUserDice = random.nextInt(6) + 1;
                int finalAiDice = random.nextInt(6) + 1;
                if (finalUserDice > finalAiDice) {
                    userWins += 1;
                    System.out.println("You are the grandmaster of Dice Rolling, congrats!");
                } else if (finalAiDice > finalUserDice) {
                    aiWins += 1;
                    System.out.println("Behold as I am the grandmaster of Dice Rolling!");
                }

            }
        }

    }
}
