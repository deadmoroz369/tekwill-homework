package com.tekwill.learning.basics.feb5;

import java.util.Scanner;

public class NumberReverserDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the integers that will be read :");
        int numberOfIntegers = scanner.nextInt();
        NumberReverser.reverseNumbers(numberOfIntegers);

    }
}