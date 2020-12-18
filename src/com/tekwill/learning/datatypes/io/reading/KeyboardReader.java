package com.tekwill.learning.datatypes.io.reading;

import java.util.Scanner;

public class KeyboardReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:\t");
        int integerReadFromKeyboard = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter another number:\t");
        int integerReadFromKeyboard1 = scanner.nextInt();
        System.out.println(integerReadFromKeyboard + integerReadFromKeyboard1);


    }


}
