package com.tekwill.learning.basics.non_access_modifiers.kingdom;

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
