package com.tekwill.learning.basics.display_a_pattern.constants;
//
import static java.lang.Math.sqrt;

public class Constants {

    final byte zero = 0;
    final byte one = 1;
    final double pi = 3.141512653589793238462643;
    final double e = 2.718281828459045235360287;
    final byte i = -1;
    final double sqrtOf2 = sqrt(2);
    final double goldenRatio = (1 + sqrt(5)) / 2;

    public static void main(String[] args) {
        Constants constants = new Constants();

        System.out.println(constants.zero);
        System.out.println(constants.one);
        System.out.println(constants.pi);
        System.out.println(constants.e);
        System.out.println(constants.i);
        System.out.println(constants.sqrtOf2);
        System.out.println(constants.goldenRatio);


    }


}

