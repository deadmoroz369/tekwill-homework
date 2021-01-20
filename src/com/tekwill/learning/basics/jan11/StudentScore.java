package com.tekwill.learning.basics.jan11;
//
import java.util.Scanner;

public class StudentScore {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Now enter the names of those " + numberOfStudents + " students and their scores: ");
        String currentStudentName = scanner.next();
        int highestScore = scanner.nextInt();
        for (int i = 1; i < numberOfStudents; i++) {
            String studentName = scanner.next();
            int studentScore = scanner.nextInt();
            if (highestScore < studentScore) {
                highestScore = studentScore;
                currentStudentName = studentName;
            }
        }
        System.out.println("Highest score: " + currentStudentName + " " + highestScore);
    }
}

