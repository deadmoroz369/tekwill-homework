package com.tekwill.learning.basics.input_and_actions.phone_keys;

import java.util.Scanner;

public class PhoneKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String digit = scanner.nextLine();
        if (digit.equals("A") || digit.equals("a") || digit.equals("B") || digit.equals("b") || digit.equals("C") || digit.equals("c")) {
            System.out.println("The corresponding number is 2");
        }
        if (digit.equals("D") || digit.equals("d") || digit.equals("E") || digit.equals("e") || digit.equals("F") || digit.equals("f")) {
            System.out.println("The corresponding number is 3");
        }
        if (digit.equals("G") || digit.equals("g") || digit.equals("H") || digit.equals("h") || digit.equals("I") || digit.equals("i")) {
            System.out.println("The corresponding number is 4");
        }
        if (digit.equals("J") || digit.equals("j") || digit.equals("K") || digit.equals("k") || digit.equals("L") || digit.equals("l")) {
            System.out.println("The corresponding number is 5");
        }
        if (digit.equals("M") || digit.equals("m") || digit.equals("N") || digit.equals("n") || digit.equals("O") || digit.equals("o")) {
            System.out.println("The corresponding number is 6");
        }
        if (digit.equals("P") || digit.equals("p") || digit.equals("Q") || digit.equals("q") || digit.equals("R") || digit.equals("r") || digit.equals("S") || digit.equals("s")) {
            System.out.println("The corresponding number is 7");
        }
        if (digit.equals("T") || digit.equals("t") || digit.equals("U") || digit.equals("u") || digit.equals("V") || digit.equals("v")) {
            System.out.println("The corresponding number is 8");
        }
        if (digit.equals("W") || digit.equals("w") || digit.equals("X") || digit.equals("x") || digit.equals("Y") || digit.equals("y") || digit.equals("Z") || digit.equals("z")) {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println("This is not a letter");
        }
    }
}
/*
1=VoiceMail; 2=ABC; 3=DEF; 4=GHI; 5=JKL; 6=MNO; 7=PQRS; 8=TUV; 9=WXYZ;
 */





