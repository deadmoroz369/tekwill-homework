package com.tekwill.learning.basics.jan18;

public class CoinFlipper {
    public static void main(String[] args) {
        int numberOfFlips = 0;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1_000_000; i++) {
            numberOfFlips = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
        }
        System.out.printf("The coin landed on Heads:%,d times\nOn Tails:%,d times", heads, tails);


    }
}