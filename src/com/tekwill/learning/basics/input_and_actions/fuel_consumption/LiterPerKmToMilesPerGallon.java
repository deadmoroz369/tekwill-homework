package com.tekwill.learning.basics.input_and_actions.fuel_consumption;
//input and action_ convert

import java.util.Scanner;

public class LiterPerKmToMilesPerGallon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel in liters:");
        float siUnitLiquid = scanner.nextFloat();
        System.out.println("Now, enter distance in km:");
        int siUnitDistance = scanner.nextInt();
        float L_TO_G = siUnitLiquid / 3.785F;
        float KM_TO_MI = siUnitDistance * 0.621F;
        float US_FORMULA = KM_TO_MI / L_TO_G;

        System.out.println("The European style uses L/km while US style uses Miles per Gallon or MPG.\nYou entered: " + siUnitDistance + " km and " + siUnitLiquid + " L\nConverting that to MPG style will result: ");
        System.out.printf("%.1f%s", US_FORMULA, " MPG");

    }


}



