package com.tekwill.learning.basics.input_and_actions.loan_payment;
//input and action_ calculate

import java.util.Scanner;

public class LoanPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you want to loan:"); //20,000
        float loanAmount = scanner.nextFloat();
        System.out.println("Enter the rate interest:"); // 6.0
        float rateInterest = scanner.nextFloat();
        System.out.println("Enter the monthly payment:"); // 386.66
        float monthlyPayment = scanner.nextFloat();
        float rateInterestPercent = (rateInterest * 0.01F) / 12;
        float firstMonthPayment = loanAmount - monthlyPayment + loanAmount * rateInterestPercent; // 19,713.34
        float secondMonthPayment = firstMonthPayment - monthlyPayment + firstMonthPayment * rateInterestPercent; // 19,425.25
        float thirdMonthPayment = secondMonthPayment - monthlyPayment + secondMonthPayment * rateInterestPercent; // 19,135.71

        System.out.printf("%s%.2f\n%s%.2f\n%s%.2f", "Balance remaining after first payment: ", firstMonthPayment, "Balance remaining after second payment:", secondMonthPayment, "Balance remaining after third payment:", thirdMonthPayment);
    }


}



