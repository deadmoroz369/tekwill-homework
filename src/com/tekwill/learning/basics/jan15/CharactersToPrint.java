package com.tekwill.learning.basics.jan15;

public class CharactersToPrint {

    public static void printChars(char char1, char char2, int numbersPerLineToDisplay) {
        if (char1 > char2) {
            char temporary = char1;
            char1 = char2;
            char2 = temporary;
        }
        for (int i = char1, count = 1; i <= (int) char2; i++, count++) {
            System.out.print((char) i + " ");
            if (count % numbersPerLineToDisplay == 0) System.out.println();
        }

    }

    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
}
