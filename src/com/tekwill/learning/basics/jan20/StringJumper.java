package com.tekwill.learning.basics.jan20;

import java.util.Scanner;

public class StringJumper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scanner.nextLine();
        System.out.println("Now I will omit the even numbers and print: ");
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}