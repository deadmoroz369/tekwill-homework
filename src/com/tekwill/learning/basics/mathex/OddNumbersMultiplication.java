package com.tekwill.learning.basics.mathex;

public class OddNumbersMultiplication {
    public static int ODD_NUM = 1;

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1) {
                ODD_NUM *= i;
            }
        }
        System.out.printf("The sum after multiplying all the odd numbers from 1 to 15 is: %,d", ODD_NUM);
    }
}
