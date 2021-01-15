package com.tekwill.learning.basics.input_and_actions.convert_to_ascii;

import java.util.Scanner;

public class IntToAsciiCased {
    public static final int MIN = 33;
    public static final int MAX = 126;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 127 for conversion to ASCII code: ");
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.out.println("NUL");
                break;
            case 1:
                System.out.println("☺");
                break;
            case 2:
                System.out.println("☻");
                break;
            case 3:
                System.out.println("♥");
                break;
            case 4:
                System.out.println("♦");
                break;
            case 5:
                System.out.println("♣");
                break;
            case 6:
                System.out.println("♠");
                break;
            case 7:
                System.out.println("•");
                break;
            case 8:
                System.out.println("◘");
                break;
            case 9:
                System.out.println("○");
                break;
            case 10:
                System.out.println("◙");
                break;
            case 11:
                System.out.println("♂");
                break;
            case 12:
                System.out.println("♀");
                break;
            case 13:
                System.out.println("♪");
                break;
            case 14:
                System.out.println("♫");
                break;
            case 15:
                System.out.println("☼");
                break;
            case 16:
                System.out.println("►");
                break;
            case 17:
                System.out.println("◄");
                break;
            case 18:
                System.out.println("↕");
                break;
            case 19:
                System.out.println("‼");
                break;
            case 20:
                System.out.println("¶");
                break;
            case 21:
                System.out.println("§");
                break;
            case 22:
                System.out.println("▬");
                break;
            case 23:
                System.out.println("↨");
                break;
            case 24:
                System.out.println("↑");
                break;
            case 25:
                System.out.println("↓");
                break;
            case 26:
                System.out.println("→");
                break;
            case 27:
                System.out.println("←");
                break;
            case 28:
                System.out.println("∟");
                break;
            case 29:
                System.out.println("↔");
                break;
            case 30:
                System.out.println("▲");
                break;
            case 31:
                System.out.println("▼");
                break;
            case 32:
                System.out.println(" ");
                break;
            case 127:
                System.out.println("⌂");
                break;
            default:
                if (n >= MIN && n <= MAX) {
                    System.out.println("Enter an ASCII code: " + n + "\nThe character for ASCII code " + n + " is " + (char) n);

                } else {
                    System.out.println("Enter a value within the range of 0 to 127");
                }
        }

    }
}





