package com.tekwill.learning.basics;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of how many numbers you want to print out: ");
        int numbers = scan.nextInt();
        int[] arr = new int[numbers];
        System.out.println("Enter " + arr.length + " numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        while (index < arr.length) {
            if (smallest > arr[index]) {
                smallest = arr[index];
            }
            index++;
        }
        System.out.println("The smallest number is : " + smallest);

    }
}