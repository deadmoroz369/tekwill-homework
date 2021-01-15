package com.tekwill.learning.basics.input_and_actions.complex_phone;

import java.util.Scanner;

import static com.tekwill.learning.basics.input_and_actions.complex_phone.PhoneLettersToKeys.*;


public class PhoneNumberCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word and I will convert it to a phone number: ");
        String digit = scanner.next();
        for (int i = 0; i < digit.length(); i++) {
            char phoneNumber = digit.charAt(i);

            switch (phoneNumber) {
                case 'A':
                    System.out.print(A);
                    break;
                case 'B':
                    System.out.print(B);
                    break;
                case 'C':
                    System.out.print(C);
                    break;
                case 'D':
                    System.out.print(D);
                    break;
                case 'E':
                    System.out.print(E);
                    break;
                case 'F':
                    System.out.print(F);
                    break;
                case 'G':
                    System.out.print(G);
                    break;
                case 'H':
                    System.out.print(H);
                    break;
                case 'I':
                    System.out.print(I);
                    break;
                case 'J':
                    System.out.print(J);
                    break;
                case 'K':
                    System.out.print(K);
                    break;
                case 'L':
                    System.out.print(L);
                    break;
                case 'M':
                    System.out.print(M);
                    break;
                case 'N':
                    System.out.print(N);
                    break;
                case 'O':
                    System.out.print(O);
                    break;
                case 'P':
                    System.out.print(P);
                    break;
                case 'Q':
                    System.out.print(Q);
                    break;
                case 'R':
                    System.out.print(R);
                    break;
                case 'S':
                    System.out.print(S);
                    break;
                case 'T':
                    System.out.print(T);
                    break;
                case 'U':
                    System.out.print(U);
                    break;
                case 'V':
                    System.out.print(V);
                    break;
                case 'W':
                    System.out.print(W);
                    break;
                case 'X':
                    System.out.print(X);
                    break;
                case 'Y':
                    System.out.print(Y);
                    break;
                case 'Z':
                    System.out.print(Z);
                    break;
            }
        }
    }
}
