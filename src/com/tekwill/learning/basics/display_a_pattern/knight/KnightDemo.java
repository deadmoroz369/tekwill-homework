package com.tekwill.learning.basics.display_a_pattern.knight;

public class KnightDemo {
    public static void main(String[] args) {
        Knight k1 = new Knight(33, "Johnson");
        Knight k2 = new Knight(19, "Fred");

        System.out.println(k1);
        System.out.println(k2);
        k1.fight();
        Knight.invokeMagic();
    }


}
