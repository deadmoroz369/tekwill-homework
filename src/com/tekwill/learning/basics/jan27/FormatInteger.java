package com.tekwill.learning.basics.jan27;

import java.util.Scanner;

public class FormatInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter how big should the number be: ");
        int zerosInput = scanner.nextInt();

        System.out.println(format(inputNumber, zerosInput));

    }

    public static String format(int number, int width) {
        String zeros = "";
        int numberLength = String.valueOf(number).length();
        if (numberLength >= width) {
            return String.valueOf(number);
        } else {
            for (int i = 0; i < width - numberLength; i++) {
                zeros = zeros.concat("0");
            }
            return zeros.concat(String.valueOf(number));
        }
    }
}


