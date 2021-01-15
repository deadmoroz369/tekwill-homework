package com.tekwill.learning.basics.input_and_actions.time_converter_to_seconds;

import java.util.Scanner;
//
public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number in seconds, I will convert it into days, hours, minutes and seconds:");
        long n = scanner.nextLong();
        long n1 = n;
        long days = n / 86400;
        n %= 86400;
        long hours = n / 3600;
        n %= 3600;
        long minutes = n / 60;
        n %= 60;
        long seconds = n;

        System.out.printf("%s%,d%s%d%s%d%s%d%s%d%s", "You entered: ", n1, " seconds, that equals to: \n", days, " days, ", hours, "hours, ", minutes, " minutes, ", seconds, " seconds.");


    }
}
