package com.tekwill.learning.basics.mathex.geometry;

import java.util.Scanner;

public class CylinderRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cylinder Radius:");
        double cylinderRadius = scanner.nextDouble();
        System.out.println("Enter Cylinder Length:");
        double cylinderLength = scanner.nextDouble();
        double areaFormula = cylinderRadius * cylinderRadius * Math.PI;
        double volumeFormula = areaFormula * cylinderLength;
        System.out.printf("%s%.2f%s%.2f%s%.2f%s%.2f", "You entered radius as: ", cylinderRadius, " and length as: ", cylinderLength, "\nWhich result in:\n Area of the cylinder:", areaFormula, "\nVolume of the cylinder", volumeFormula);
    }


}