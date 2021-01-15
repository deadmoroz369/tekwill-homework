package com.tekwill.learning.basics.input_and_actions.world_population;


import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the world population number:");
        long world = scanner.nextLong();
        System.out.println("Choose a country:");
        String chooseCountry = scanner.next(); //won't run if >1 String
        System.out.println("Enter the total population of " + chooseCountry + ":");
        long country = scanner.nextLong();
        double percentResult = (double) country / world * 100;
        System.out.printf("%s%s%s%.2f%s%s", "The population of ", chooseCountry, " is ", percentResult, "%", " of the world population");
    }
}




/*    World Population according to Census on 12/19/2020 at 16:37 is 7730817755
      U.S. Population according to Census on 12/19/2020 at 16:37 is 330727585
 */