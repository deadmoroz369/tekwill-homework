package com.tekwill.learning.basics.menuchart;

import java.util.Scanner;

import static com.tekwill.learning.basics.menuchart.MenuChartOptions.*;

public class MenuChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select one of the following:\n" + OPTION_ONE + "\t\t" + OPTION_TWO + "\n" + OPTION_THREE + "\t\t" + OPTION_FOUR + "\n");
        char yourChoice = scanner.next().charAt(0);

        while (yourChoice != 'a' && yourChoice != 'b' && yourChoice != 'c' && yourChoice != 'd') {
            System.out.println("Try again. Choose from the available options.");
            yourChoice = scanner.next().charAt(0);
        }
        //wrongAnswer = false;
        switch (yourChoice) {
            case 'a':
                System.out.printf("Enjoy your %s!", OPTION_ONE_CHOICE);
                break;
            case 'b':
                System.out.printf("Enjoy your %s!", OPTION_TWO_CHOICE);
                break;
            case 'c':
                System.out.printf("Enjoy your %s!", OPTION_THREE_CHOICE);
                break;
            case 'd':
                System.out.printf("Enjoy your %s!", OPTION_FOUR_CHOICE);

        }
    }
}