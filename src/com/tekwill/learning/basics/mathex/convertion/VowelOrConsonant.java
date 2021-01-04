package com.tekwill.learning.basics.mathex.convertion;

import java.util.Scanner;

public class VowelOrConsonant {
    static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char aLetter = scanner.next().charAt(0);
        char letter = Character.toLowerCase(aLetter);
        if (isVowel(letter)) {
            System.out.println(aLetter + " is a vowel");
        } else if (!isVowel(letter)) {
            if ('b' <= letter && letter <= 'z') {
                System.out.println(aLetter + " is a consonant");
            } else {
                System.out.println(aLetter + " is an invalid input");
            }
        }
    }
}