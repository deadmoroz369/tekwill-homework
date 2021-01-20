package com.tekwill.learning.basics.dec30;
//
import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7 and get the week day: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.printf("The %dst day of the week is Monday", day);
                break;
            case 2:
                System.out.printf("The %dnd day of the week is Tuesday", day);
                break;
            case 3:
                System.out.printf("The %drd day of the week is Wednesday", day);
                break;
            case 4:
                System.out.printf("The %dth day of the week is Thursday", day);
                break;
            case 5:
                System.out.printf("The %dth day of the week is Friday", day);
                break;
            case 6:
                System.out.printf("The %dth day of the week is Saturday", day);
                break;
            case 7:
                System.out.printf("The %dth day of the week is Sunday", day);
                break;
            default:
                System.out.println("Enter a number from 1 to 7!");
        }
    }
}
