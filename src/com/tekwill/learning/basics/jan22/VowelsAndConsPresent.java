package com.tekwill.learning.basics.jan22;

import java.util.Scanner;

public class VowelsAndConsPresent {
    public static final String vowels = "AIOUE";
    public static final String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
    static int vowelsCounter;
    static int consonantsCounter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word and I will count the vowels and the consonants present: ");
        String wordToEnter = scanner.nextLine();


        for (int i = 0; i < wordToEnter.length(); i++) {

            if (vowels.contains(String.valueOf(Character.toUpperCase(wordToEnter.charAt(i))))) {
                vowelsCounter++;
            } else if (consonants.contains(String.valueOf(Character.toUpperCase(wordToEnter.charAt(i))))) {
                consonantsCounter++;
            } else {
                System.out.print("");
            }
        }
        System.out.println("The number of vowels in the string: " + vowelsCounter);
        System.out.println("The number of consonants in the string: " + consonantsCounter);
    }
}
