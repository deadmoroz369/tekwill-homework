package com.tekwill.learning.basics.feb12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordSeparator {
    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.println("Enter a sentence with no spaces "
                + "between the words and each " + "word is capitalized.");


        // get user input
        String userInput = keyboard.nextLine();

        List<String> sentenceElements = Arrays.stream(
                userInput.split("(?=[A-Z])")).collect(Collectors.toList());

        // properly format sentence
        List<String> sentence = new ArrayList<>();
        for (int x = 0; x < sentenceElements.size(); x++) {
            if (x == 0) {
                sentence.add(sentenceElements.get(x));
            } else {
                sentence.add(sentenceElements.get(x).toLowerCase());
            }
        }

        System.out.println(String.join(" ", sentence));
    }
}

