package com.tekwill.learning.basics.jan15;

public class DisplayPattern {
    public static void displayPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n + 1 - i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("Pattern A\n");
        displayPatternA(6);

        System.out.println("\nPattern B\n");
        displayPatternB(6);

        System.out.println("\nPattern C\n");
        displayPatternC(6);

        System.out.println("\nPattern D\n");
        displayPatternD(6);
    }
}

