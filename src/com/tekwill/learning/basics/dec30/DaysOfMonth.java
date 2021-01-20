package com.tekwill.learning.basics.dec30;

import java.util.Scanner;
//
public class DaysOfMonth {
    public static final int MONTH_WITH_31_DAYS = 31;
    public static final int MONTH_WITH_30_DAYS = 30;
    public static final int MONTH_FEBRUARY = 28;
    public static final int MONTH_FEBRUARY_LEAP = 29;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month as number: ");
        int month = scanner.nextInt();
        if (month == 2) {
            System.out.println("February is Special, so I need you to enter the current year: ");
            int year = scanner.nextInt();
            if (year % 4 == 0) {
                System.out.printf("Since %d is a leap year, February has %d days.", year, MONTH_FEBRUARY_LEAP);

            } else {
                System.out.printf("Since %d is not a leap year, February has %d days.", year, MONTH_FEBRUARY);
            }
        } else {
            switch (month) {
                case 1:
                    System.out.printf("The %dst month is January, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 3:
                    System.out.printf("The %drd month is March, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 4:
                    System.out.printf("The %dth month is April, it has: %d days", month, MONTH_WITH_30_DAYS);
                    break;
                case 5:
                    System.out.printf("The %dth month is May, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 6:
                    System.out.printf("The %dth month is June, it has: %d days", month, MONTH_WITH_30_DAYS);
                    break;
                case 7:
                    System.out.printf("The %dth month is July, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 8:
                    System.out.printf("The %dth month is August, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 9:
                    System.out.printf("The %dth month is September, it has: %d days", month, MONTH_WITH_30_DAYS);
                    break;
                case 10:
                    System.out.printf("The %dth month is October, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                case 11:
                    System.out.printf("The %dth month is November, it has: %d days", month, MONTH_WITH_30_DAYS);
                    break;
                case 12:
                    System.out.printf("The %dth month is December, it has: %d days", month, MONTH_WITH_31_DAYS);
                    break;
                default:
                    System.out.println("No such month exists!");
            }
        }


    }
}