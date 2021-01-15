package com.tekwill.learning.basics.input_and_actions.display_pattern;
//
import java.util.Scanner;

public class DisplayPattern {


    public static class DisplayPatterns {
        public static void displayPattern(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = n + 1 - i; j > 1; j--) {
                    System.out.print("  ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int numbers = 3;
            while (numbers > 0) {
                displayPattern(scanner.nextInt());
                numbers--;
            }

        }
    }


}
