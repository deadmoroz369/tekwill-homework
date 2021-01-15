package com.tekwill.learning.basics.input_and_actions.foot_to_inch;

//input and action _convert
import java.util.Scanner;

public class FeetAndInches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in inches : ");
        int inches = scanner.nextInt();

        int feet = inches / 12;
        int remain = inches % 12;

        System.out.print("Your height in feet and inches is: " + feet + " feet " + "and " + remain + " inches");

    }
}
