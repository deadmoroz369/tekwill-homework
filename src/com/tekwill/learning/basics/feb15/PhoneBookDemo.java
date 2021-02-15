package com.tekwill.learning.basics.feb15;

import static com.tekwill.learning.basics.feb15.PhoneBookEntry.phoneBook;

public class PhoneBookDemo {
    public static void main(String[] args) {
        phoneBook.add(new PhoneBookEntry("Zane", "669-275-3236"));
        phoneBook.add(new PhoneBookEntry("Miller", "408-445-3689"));
        phoneBook.add(new PhoneBookEntry("Josh", "405-669-6874"));
        phoneBook.add(new PhoneBookEntry("Ben", "410-114-1194"));
        phoneBook.add(new PhoneBookEntry("Charles", "510-118-6697"));

        for (PhoneBookEntry entry : phoneBook) {
            System.out.println(entry);
        }

    }
}

