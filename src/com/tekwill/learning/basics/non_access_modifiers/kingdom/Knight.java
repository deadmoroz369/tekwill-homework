package com.tekwill.learning.basics.non_access_modifiers.kingdom;

public class Knight {

    static String guild = "Hunters";
    final int age;
    final String nickname;


    public Knight(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public static char invokeMagic() {
        System.out.println("Maaaagic");
        return 0;
    }

    public char fight() {
        System.out.println("Fight");
        return 0;
    }

    @Override
    public String toString() {
        return "The knight: " + nickname + " is " + age + " years old!\n" + "of the guild: " + guild;


    }
}

