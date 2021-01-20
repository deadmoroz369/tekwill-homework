package com.tekwill.learning.basics.jan13;

public class FeetToMeters {
    public static final String FEET_METERS = "Feet\t\tMeters";
    public static final String METERS_FEET = "Meters\t\tFeet";
    public static final String LINE = "_";
    public static double FOOT_TO_METER = 0.348;
    public static double METER_TO_FOOT = 3.28084;

    public static double footToMeter(double foot) {
        return foot * FOOT_TO_METER;
    }

    public static double meterToFoot(double meter) {
        return meter * METER_TO_FOOT;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            System.out.println(FEET_METERS + "\t\t|\t\t" + METERS_FEET);

        }
        for (int i = 0; i < 53; i++) {
            System.out.print(LINE);

        }
        double foot = 1.0;
        double meter = 20.0;

        while (foot <= 10) {
            System.out.print("\n");
            System.out.printf("%4.1f %11.3f        | %10.1f %14.3f", foot, footToMeter(foot), meter, meterToFoot(meter));
            foot++;
            meter += 5;
        }
    }
}

