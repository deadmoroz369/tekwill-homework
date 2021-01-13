package com.tekwill.learning.basics;

import java.util.Scanner;

public class StudentsScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many students do you have: ");
        int numberOfStudents = scanner.nextInt();
        int[] howManyStudents = new int[numberOfStudents];
        System.out.println("Now enter the names of all " + howManyStudents.length + " students: ");// print the number entered
        //ask for names
        String nameOfStudent = scanner.nextLine();
        String[] giveNames = {nameOfStudent};
        for (int i = 0; i < howManyStudents.length; i++) {

            giveNames[i] = scanner.nextLine();
        }
        System.out.println("Students");
        for (int i = 0; i < giveNames.length; i++) {
            System.out.println(giveNames[i]);

        }

    }
}


//    Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number of how many numbers you want to print out: ");
//    int numbers = scan.nextInt();
//    int[] arr = new int[numbers];
//        System.out.println("Enter " + arr.length + " numbers:");
//
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = scan.nextInt();
//    }
//        System.out.println("The numbers you entered are:");
//        for (int i = 0; i < arr.length; i++) {
//        System.out.println(arr[i]);
//    }
//    int smallest = Integer.MAX_VALUE;
//    int index = 0;
//        while (index < arr.length) {
//        if (smallest > arr[index]) {
//            smallest = arr[index];
//        }
//        index++;
//    }
//        System.out.println("The smallest number is : " + smallest);
//
//
//



/*
1. get input of how many students
2. get all students names
3. get all students scores
4. print the highest score with the name of that specific student

 */