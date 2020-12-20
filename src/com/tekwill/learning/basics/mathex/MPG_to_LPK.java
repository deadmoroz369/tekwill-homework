package com.tekwill.learning.basics.mathex;

import java.util.Scanner;

public class MPG_to_LPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel in liters:");
        float euLiquid = scanner.nextFloat();
        System.out.println("Now, enter distance in km:");
        int euDistance = scanner.nextInt();
        float L_TO_G = euLiquid / 3.785F;
        float KM_TO_MI = euDistance * 0.621F;
        float US_FORMULA = KM_TO_MI / L_TO_G;

        System.out.println("The European style uses L/km while US style uses Miles per Gallon or MPG.\nYou entered: " + euDistance + " km and " + euLiquid + " L\nConverting that to MPG style will result: ");
        System.out.printf("%.1f%s", US_FORMULA, " MPG");

    }


}



