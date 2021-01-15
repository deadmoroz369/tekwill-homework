package com.tekwill.learning.basics.input_and_actions.financial_application;
//
import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a money value for the financial application:");
        int n = scanner.nextInt();
        System.out.println("Enter the percent value:");
        float n2 = scanner.nextFloat();
        n2 = n2 * 0.01F;
        float n3 = n * n2;
        float n4 = n + n3;
        System.out.println(n4);

    }


}
