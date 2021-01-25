package com.tekwill.learning.basics.jan22;

import java.util.Scanner;

public class UpperCaseChars {
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word that contains an uppercase:");
        String wordToEnter = scanner.nextLine();

        for (int i = 0; i < wordToEnter.length(); i++) {
            if (Character.isUpperCase(wordToEnter.charAt(i))) {
                n += 1;
            }
        }
        if (n > 0)
            System.out.printf("There are %d uppercase letters.", n);
        else
            System.out.println("There are no uppercase letters");
    }
}

