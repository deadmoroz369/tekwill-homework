package com.tekwill.learning.basics.jan20;

import java.util.Scanner;

public class EqualStrings {

    static int charCounter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 word and I will check if there are any words in common!\nEnter the first word:");
        String firstWord = scanner.nextLine();
        System.out.print("Enter second word:");
        String secondWord = scanner.nextLine();
        int minLength = firstWord.length();
        if (firstWord.length() > secondWord.length()) minLength = secondWord.length();

        for (int i = 0; i < minLength; i++) {
            if (firstWord.charAt(i) == secondWord.charAt(i)) {
                charCounter += 1;
            } else {
                if (charCounter == 0) System.out.println("There is nothing in common between the words.");
                break;
            }
        }
        if (charCounter != 0)
            System.out.println("The common characters between the 2: " + firstWord.substring(0, charCounter));
    }
}
