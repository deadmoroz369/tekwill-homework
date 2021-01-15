package com.tekwill.learning.basics.input_and_actions.multiplication_table;
//
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want a multiplication table for: ");
        int number = scanner.nextInt();
        System.out.print("Now enter the range to which number you want the multiplication for:");
        int multiply = scanner.nextInt();
        for (int i = 1; i <= multiply; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }


    }
}

