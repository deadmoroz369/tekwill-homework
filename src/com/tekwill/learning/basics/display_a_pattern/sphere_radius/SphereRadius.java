package com.tekwill.learning.basics.display_a_pattern.sphere_radius;

//display_ a pattern math
public class SphereRadius {

    public static void main(String[] args) {
        final int SPHERE_RADIUS = 10;
        final int RADIUS_TO_3 = SPHERE_RADIUS * SPHERE_RADIUS * SPHERE_RADIUS;
        double PI = Math.PI;
        double DIVISION = 4.0 / 3.0;
        double FORMULA = DIVISION * PI * RADIUS_TO_3;

        System.out.printf("%.2f", FORMULA);
    }


}

