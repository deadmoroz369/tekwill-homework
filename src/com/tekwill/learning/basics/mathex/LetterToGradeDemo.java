package com.tekwill.learning.basics.mathex;

import java.util.Scanner;

import static com.tekwill.learning.basics.mathex.LetterToGrade.convertToNumber;

public class LetterToGradeDemo {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an uppercase letter from A to F:");
        char letter = scanner.next().charAt(0);
        convertToNumber(letter);
    }
}

