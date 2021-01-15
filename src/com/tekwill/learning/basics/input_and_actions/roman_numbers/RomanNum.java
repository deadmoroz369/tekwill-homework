package com.tekwill.learning.basics.input_and_actions.roman_numbers;
//
import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 to 10:");
        int n = scanner.nextInt();
        String roman;
        switch (n) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                roman = "Error message!!!";
        }
        if (1 <= n && n < 11) {
            System.out.printf("The Roman style of writing number of %d is %s", n, roman);
        } else {
            System.out.println(roman);
        }
    }
}
