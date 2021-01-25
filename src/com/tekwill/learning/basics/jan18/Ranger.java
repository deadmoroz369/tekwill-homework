//package com.tekwill.learning.basics.jan18;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Spliterator;
//import java.util.stream.IntStream;
//
//public class Ranger {
////    static void reverse(int a[], int n)
////    {
////        int i, k, t;
////        for (i = 0; i < n / 2; i++) {
////            t = a[i];
////            a[i] = a[n - i - 1];
////            a[n - i - 1] = t;
////        }
////
////        /*printing the reversed array*/
////        System.out.print("Reversed array is: \n");
////        for (k = 0; k < n; k++) {
////            System.out.print(a[k]+ " ");
////        }
////    }
////
////    public static void main(String[] args)
////    {
////        int [] arr = IntStream.rangeClosed(1,10).toArray();
////        reverse(arr, arr.length);
////    }
////}
//// Function to print first and last
//// character of a string
//public static void firstAndLastCharacter(String str)
//{
//
//    // Finding string length
//    int n = str.length();
//
//    // First character of a string
//    char first = str.charAt(0);
//
//    // Last character of a string
//    char last = str.charAt(n - 1);
//
//    for (int i = 0; i < n; i++) {
//        System.out.print(first);
//    }
//    // Printing first and last
//    // character of a string
//    System.out.println("First: " + first);
//    System.out.println("Last: " + last);
//}
//
//    // Driver Code
//    public static void main(String args[])
//    {
//        // Given string str
//        Scanner scanner = new Scanner(System.in);
//        String str = "GeeksForGeeks";
//
//        // Function Call
//        firstAndLastCharacter(str);
//    }
//
//
//}