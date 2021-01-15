package com.tekwill.learning.basics.display_a_pattern.miles_to_km;
//
public class MilesToKm {
    public static final double MILES_TO_KM = 1.609;

    public static void main(String[] args) {
        System.out.println("Miles          Km");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%-12d   %-20.3f\n", i, i * MILES_TO_KM);
        }
    }
}