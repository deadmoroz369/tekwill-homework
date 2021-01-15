package com.tekwill.learning.basics.display_a_pattern.factorial;
//
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Number   Factorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%2d        %d\n", i, factorial);
        }

    }
}