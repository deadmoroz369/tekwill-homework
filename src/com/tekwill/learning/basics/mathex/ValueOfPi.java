package com.tekwill.learning.basics.mathex;

import java.util.Scanner;

public class ValueOfPi {

    public static void main(String[] args) {

        System.out.println("Let's find the value of 3.14159! Enter a number in range of 0 to 200,000: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int odd = 1;
        double pi = 0.0;
        double currentTerm = 0.0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                currentTerm = (double) -4 / odd;
            } else {
                currentTerm = (double) 4 / odd;
            }
            odd = odd + 2;
            pi = pi + currentTerm;
        }
        System.out.printf("%.5f", pi);
    }
}