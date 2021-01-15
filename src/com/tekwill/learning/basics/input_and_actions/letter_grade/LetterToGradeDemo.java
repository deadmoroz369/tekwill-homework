package com.tekwill.learning.basics.input_and_actions.letter_grade;
//
import java.util.Scanner;

import static com.tekwill.learning.basics.input_and_actions.letter_grade.LetterToGrade.convertToNumber;

public class LetterToGradeDemo {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter from A to F:");
        char letter = scanner.next().charAt(0);
        convertToNumber(letter);
    }
}

