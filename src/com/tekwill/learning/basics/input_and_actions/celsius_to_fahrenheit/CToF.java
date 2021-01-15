package com.tekwill.learning.basics.input_and_actions.celsius_to_fahrenheit;

import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the degrees in celsius:");
        double celsiusDegree = scanner.nextDouble();
        double celsiusToFahrenheit = (9.0 / 5.0) * celsiusDegree + 32;
        System.out.println(celsiusToFahrenheit);
    }


}
