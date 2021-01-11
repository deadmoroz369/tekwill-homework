package com.tekwill.learning.quiz;

import java.util.Random;
import java.util.Scanner;

import static com.tekwill.learning.quiz.VikingQuiz.*;

public class Game {
    public static void main(String[] args) {
//         String help = "Help";  !!!DON'T USE ANYTHING THAT IS COMMENTED AT THIS TIME BUGS ARE EXPECTED!!!
        String friend = "Friend thinks that the correct answer is: ";
        String auditory = "Auditory says the possible correct answer is: ";
        String probability = "Two of possible incorrect answers were omitted: ";
        boolean gameMenuRunning = true;
        boolean gameOver = false;
        int questionNumber = 1;
        int questionScore = 0;
        int currentScore = 0;
        String currentCorrectAnswer = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there!" + VIKING_QUIZ);
        do {
            System.out.print("Enter [Y] to begin the quiz or [N] to Exit: ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                do {
                    switch (questionNumber) {
                        case 1:
                            System.out.println(VIKING_Q1);
                            System.out.println("a)" + VIKING_Q1_A_A);
                            System.out.println("b)" + VIKING_Q1_A_B);
                            System.out.println("c)" + VIKING_Q1_A_C);
                            System.out.println("d)" + VIKING_Q1_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "C";
                            questionScore = 1;
                            break;
                        case 2:
                            System.out.println(VIKING_Q2);
                            System.out.println("a)" + VIKING_Q2_A_A);
                            System.out.println("b)" + VIKING_Q2_A_B);
                            System.out.println("c)" + VIKING_Q2_A_C);
                            System.out.println("d)" + VIKING_Q2_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "B";
                            questionScore = 1;
                            break;
                        case 3:
                            System.out.println(VIKING_Q3);
                            System.out.println("a)" + VIKING_Q3_A_A);
                            System.out.println("b)" + VIKING_Q3_A_B);
                            System.out.println("c)" + VIKING_Q3_A_C);
                            System.out.println("d)" + VIKING_Q3_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "A";
                            questionScore = 1;
                            break;
                        case 4:
                            System.out.println(VIKING_Q4);
                            System.out.println("a)" + VIKING_Q4_A_A);
                            System.out.println("b)" + VIKING_Q4_A_B);
                            System.out.println("c)" + VIKING_Q4_A_C);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "A";
                            questionScore = 1;
                            break;
                        case 5:
                            System.out.println(VIKING_Q5);
                            System.out.println("a)" + VIKING_Q5_A_A);
                            System.out.println("b)" + VIKING_Q5_A_B);
                            System.out.println("c)" + VIKING_Q5_A_C);
                            System.out.println("d)" + VIKING_Q5_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "B";
                            questionScore = 1;
                            break;
                        case 6:
                            System.out.println(VIKING_Q6);
                            System.out.println("a)" + VIKING_Q6_A_A);
                            System.out.println("b)" + VIKING_Q6_A_B);
                            System.out.println("c)" + VIKING_Q6_A_C);
                            System.out.println("d)" + VIKING_Q6_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "D";
                            questionScore = 1;
                            break;
                        case 7:
                            System.out.println(VIKING_Q7);
                            System.out.println("a)" + VIKING_Q7_A_A);
                            System.out.println("b)" + VIKING_Q7_A_B);
                            System.out.println("c)" + VIKING_Q7_A_C);
                            System.out.println("d)" + VIKING_Q7_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "A";
                            questionScore = 1;
                            break;
                        case 8:
                            System.out.println(VIKING_Q8);
                            System.out.println("a)" + VIKING_Q8_A_A);
                            System.out.println("b)" + VIKING_Q8_A_B);
                            System.out.println("c)" + VIKING_Q8_A_C);
                            System.out.println("d)" + VIKING_Q8_A_D);
//                             System.out.println("Enter [Help] to get help");
                            currentCorrectAnswer = "C";
                            questionScore = 1;
                            break;
                    }

                    String questionResponse = scanner.nextLine();

                    if (questionResponse.equalsIgnoreCase(currentCorrectAnswer)) {
                        questionNumber++;
                        currentScore += questionScore;// correct answer + 1 point
                    } else {
                        questionNumber++;
                        currentScore += 0; // incorrect answer + 0 point

                    }
//                     if (questionResponse.equalsIgnoreCase(help)) {
//                         System.out.println("Choose who's help you want: \na)Friend\nb)Auditory\nc)Probability");
//                         String getHelp = scanner.nextLine();
//                         if (getHelp.equalsIgnoreCase("A")) {
//                             System.out.println(friend + currentCorrectAnswer);
//                         }
//                         if (getHelp.equalsIgnoreCase("B")) {
//                             System.out.println(auditory + "A:" + new Random().nextInt(10) + " B:" + new Random().nextInt(15) + " C:" + new Random().nextInt(25) + " D:" + new Random().nextInt(50));
//                         }
//                         if (getHelp.equalsIgnoreCase("C")) {
//                             System.out.println(probability + "A:" + 50 + " C:" + 50);
//                         }
                    }
                    if (questionNumber >= 9) {
                        if (currentScore == 0 || currentScore == 1) {
                            System.out.println(RESULT_0);
                        }
                        if (currentScore == 2 || currentScore == 3) {
                            System.out.println(RESULT_25);
                        }
                        if (currentScore == 4 || currentScore == 5) {
                            System.out.println(RESULT_50);
                        }
                        if (currentScore == 6 || currentScore == 7) {
                            System.out.println(RESULT_75);
                        }
                        if (currentScore == 8) {
                            System.out.println(RESULT_100);
                        }
                        gameOver = true;
                    }

                } while (!gameOver);
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
                gameMenuRunning = false;
            } else {
                System.out.print("Enter [Y] to begin the quiz or [N] to Exit: ");
            }

        } while (gameMenuRunning);
    }
}
