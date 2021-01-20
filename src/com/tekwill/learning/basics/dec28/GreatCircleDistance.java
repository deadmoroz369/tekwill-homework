package com.tekwill.learning.basics.dec28;
//
import java.util.Scanner;

public class GreatCircleDistance {
    public static double calculateGreatCircleDistance(float x1Latitude, float y1Longitude, float x2Latitude, float y2Longitude) {
        final double RADIUS = 6371.01;
        double x1 = Math.toRadians(x1Latitude);
        double y1 = Math.toRadians(y1Longitude);
        double x2 = Math.toRadians(x2Latitude);
        double y2 = Math.toRadians(y2Longitude);

        return RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        float x1Latitude = scanner.nextFloat();
        float y1Longitude = scanner.nextFloat();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        float x2Latitude = scanner.nextFloat();
        float y2Longitude = scanner.nextFloat();
        System.out.printf("The distance between the two points is: %.2f km", calculateGreatCircleDistance(x1Latitude, y1Longitude, x2Latitude, y2Longitude));


    }
}



/*
d = radius * arccos(sin(x1)) * sin(x2) + cos(x1) * cos(x2) * cos(y1-y2))
 */