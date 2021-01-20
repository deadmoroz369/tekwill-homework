package com.tekwill.learning.basics.dec21;
//
import java.util.Scanner;

public class TaxIncluded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money in dollars and cents:");
        double moneyAmount = scanner.nextDouble();
        double taxIncluded = moneyAmount * 0.05;
        double moneyAfterTax = moneyAmount + taxIncluded;

        System.out.printf("%.2f", moneyAfterTax);


    }


}
