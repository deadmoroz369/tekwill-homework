package com.tekwill.learning.basics.display_a_pattern.area_of_pentagon;

public class AreaOfPentagon {
    public static void main(String[] args) {
        double r = 5.5;
        double s = 2 * r * Math.sin(Math.PI / 5);
        double areaFormula = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println(areaFormula);
    }

}


