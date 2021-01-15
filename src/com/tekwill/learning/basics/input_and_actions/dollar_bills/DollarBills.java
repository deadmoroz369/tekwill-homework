package com.tekwill.learning.basics.input_and_actions.dollar_bills;

import java.util.Scanner;

public class DollarBills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of dollars:");
        int n = scanner.nextInt();
        int n1 = n;
        int n100 = n / 100;
        n %= 100;
        int n50 = n / 50;
        n %= 50;
        int n20 = n / 20;
        n %= 20;
        int n10 = n / 10;
        n %= 10;
        int n5 = n / 5;
        n %= 5;
        System.out.printf("%s%d%s%d%s%d%s%d%s%d%s%d%s%d%s", "You entered: ", n1, " $\nThat is:\n", n100, " bills of 100 $\n", n50, " bills of 50 $\n", n20, " bills of 20 $\n", n10, " bills of 10 $\n", n5, " bills of 5 $\n", n, " bills of 1 $");


    }


}
