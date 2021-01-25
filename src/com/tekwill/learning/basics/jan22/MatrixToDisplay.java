package com.tekwill.learning.basics.jan22;

import java.util.Random;
import java.util.Scanner;

public class MatrixToDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rand.nextBoolean() ? "1 " : "0 ");
            }
            System.out.println();
        }
    }


}