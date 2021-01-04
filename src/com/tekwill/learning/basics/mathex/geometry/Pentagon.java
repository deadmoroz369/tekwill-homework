package com.tekwill.learning.basics.mathex.geometry;

public class Pentagon {
    public static void main(String[] args) {
        double r = 5.5;
        double s = 2 * r * Math.sin(Math.PI / 5);
        double areaFormula = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println(areaFormula);
    }

}


