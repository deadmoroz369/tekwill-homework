package com.tekwill.learning.basics.jan27;

import java.util.Scanner;

public class CreditCards {
    public static int MIN_CREDIT_CARD_NUMBER_LENGTH = 13;
    public static int MAX_CREDIT_CARD_NUMBER_LENGTH = 16;
    static int sumEven;
    static int sumOdd;
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Credit Card Number:");
        long creditCardNumber = scanner.nextLong();    

        if (isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " Is Valid.");
        } else
            System.out.println(creditCardNumber + " Is Invalid.");

    }

    public static boolean isValid(long number) {
        if (getSize(number) < MIN_CREDIT_CARD_NUMBER_LENGTH || getSize(number) > MAX_CREDIT_CARD_NUMBER_LENGTH) {
            return false;
        }
        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {
            return false;
        }

        return prefixMatched(number);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int numberLength = getSize(number);
        for (int i = 0; i < numberLength; i += 2) {
            char charDigit = String.valueOf(number).charAt(i);
            int digit = Integer.parseInt(String.valueOf(charDigit));
            sumEven += getDigit(digit * 2);
        }
        return sumEven;
    }

    public static int getDigit(int number) {
        if (number > 9) {
            return number / 10 + number % 10;
        } else {
            return number;
        }
    }

    public static int sumOfOddPlace(long number) {
        int numberLength = getSize(number);
        for (int i = 1; i < numberLength; i += 2) {
            char charDigit = String.valueOf(number).charAt(i);
            int digit = Integer.parseInt(String.valueOf(charDigit));
            sumOdd += digit;
        }
        return sumOdd;
    }

    public static boolean prefixMatched(long number) {
        char firstDigit = String.valueOf(number).charAt(0);
        char secondDigit = String.valueOf(number).charAt(1);
        char prefix1 = '4';
        char prefix2 = '5';
        char prefix3 = '6';
        String prefix4 = "37";

        return firstDigit == prefix1 || firstDigit == prefix2 || firstDigit == prefix3 || (firstDigit == prefix4.charAt(0) && secondDigit == prefix4.charAt(1));
    }

    public static int getSize(long d) {
        return String.valueOf(d).length();
    }

  

    public static long getPrefix(long number, int k) {
        int numberLength = getSize(number);
        String prefix = "";
        if (k >= numberLength) {
            return number;
        } else {
            for (int i = 0; i < k; i++) {
                char charDigit = String.valueOf(number).charAt(i);
                prefix.concat(String.valueOf(charDigit));
            }
            return Integer.parseInt(prefix);
        }
    }


}

