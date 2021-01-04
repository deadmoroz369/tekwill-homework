package com.tekwill.learning.basics.mathex.convertion;

public class KgToLbsConverter {
    public static double KG_TO_LBS = 2.20;

    public static void main(String[] args) {
        System.out.println("Kilograms     Pounds   |   Pounds       Kilograms");
        for (int i = 1, j = 20; i < 200; i = i + 2, j += 5) {
            if (j < 520) {
                System.out.printf("%-5d   %10.1f     |    %-4d      %10.2f\n", i, i * KG_TO_LBS, j, j / KG_TO_LBS);
            } else {
                System.out.printf("%-5d   %10.1f     |\n", i, i * KG_TO_LBS);
            }
        }
    }
}

