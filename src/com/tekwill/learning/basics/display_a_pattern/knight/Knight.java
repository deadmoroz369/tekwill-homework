package com.tekwill.learning.basics.display_a_pattern.knight;

public class Knight {

    static String guild = "Hunters";
    private final int age;
    private final String nickname;


    public Knight(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public static void invokeMagic() {
        System.out.println("Magic");
    }

    public void fight() {
        System.out.println("Fight");
    }

    @Override
    public String toString() {
        return "The knight: " + nickname + " is " + age + " years old!\n" + "of the guild: " + guild;
    }

}