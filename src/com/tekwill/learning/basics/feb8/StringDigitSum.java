package com.tekwill.learning.basics.feb8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringDigitSum {


    public static void calculateSum(String numbersByCommas) {

        List<String> numbers = new ArrayList<>();
        int sumOfNumbers = 0;

        numbers.addAll(Arrays.asList(numbersByCommas.split(",")));
        for (String number : numbers) {
            sumOfNumbers += Integer.parseInt(number);
        }

        System.out.println("Sum of the numbers is " + sumOfNumbers);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by comma :");
        calculateSum(scanner.nextLine());
    }
}
