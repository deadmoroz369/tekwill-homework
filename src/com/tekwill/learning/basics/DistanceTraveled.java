package com.tekwill.learning.basics;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in miles.");
        int distance = scanner.nextInt();
        System.out.println("Now enter time in hours.");
        int time = scanner.nextInt();
        System.out.println("Hours   Distance Traveled");
        System.out.println("-------------------------");

        for (int i = 1; i <= time; i++) {
            System.out.println(i + "               " + distance * i);
        }

    }
}
/*
2 inputs -> distance in miles and time in hours
display example:
Hour     Distance Traveled
--------------------------
1                40
2                80
3               120
   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want a multiplication table for: ");
        int number = scanner.nextInt();
        System.out.print("Now enter the range to which number you want the multiplication for:");
        int multiply = scanner.nextInt();
        for (int i = 1; i <=multiply; i++) {
            System.out.println(number + "X" + i + "=" + number*i);
        }



        }
    }
 */