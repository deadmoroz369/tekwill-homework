package com.tekwill.learning.basics.jan18;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultitaskingVersionA78 {

    public static void main(String[] args) {
        //a)
        int[] f = IntStream.rangeClosed(1, 7).toArray();
        System.out.printf("The value element 6 of array f is: %d%n", f[5]);
        //b)
        int[] g = IntStream.rangeClosed(1, 5).toArray();
        Arrays.fill(g, 8);
        System.out.printf("The values for array g in range of 1 to 5 are now changed to: 1 -> %d; 2 -> %d; 3 -> %d; 4 -> %d; 5 -> %d%n", g[1], g[2], g[3], g[4], g[4]);
        //c)

        //c

        double[] c;
        double total = 0;
        c = new double[100];
        for (int i = 0; i <= c.length; i++) {
            double n = 1.0 * i;
            System.out.println(n);
        }

    }
}

//
//        //c
//
//        double[] c;
//        double total = 0;
//        c = new double[100];
//        for (int i = 0; i < c.length; i++) {
//            total += c[i];
//        }
//
//        //d
//
//        int[] a;
//        int[] b;
//        a = new int[11];
//        b = new int[34];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//
//        //   e)
//
//
//        double[] w;
//        w = new double[99];
//
//        Random random = new Random();
//        for (int i = 0; i < w.length; i++) {
//            w[i] = random.nextDouble();
//        }
//
//        double minValue = w[0];
//        double maxValue = w[0];
//        for (int i = 0; i < w.length; i++) {
//            if (w[i] < minValue) {
//                minValue = w[i];
//            }
//            if (w[i] > maxValue) {
//                maxValue = w[i];
//            }
//        }
//        System.out.println("The smallest value in array w is " + minValue);
//        System.out.println("The largest value in array w is " + maxValue);
//
//    }
//}




