package com.tekwill.learning.basics.input_and_actions.twelve_days_of_christmas_song;

import java.util.Scanner;

import static com.tekwill.learning.basics.input_and_actions.twelve_days_of_christmas_song.TwelveDaysOfChristmasKeywords.*;

public class TwelveDaysOfChristmas {
    public static final int VERSES = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which verse do you want me to display: ");
        int verse = scanner.nextInt();
        int VERSES_REMAIN = VERSES - verse;

        switch (verse) {
            case 1:
                System.out.println(VERSE_1 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 2:
                System.out.println(VERSE_2 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 3:
                System.out.println(VERSE_3 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 4:
                System.out.println(VERSE_4 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 5:
                System.out.println(VERSE_5 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 6:
                System.out.println(VERSE_6 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 7:
                System.out.println(VERSE_7 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 8:
                System.out.println(VERSE_8 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 9:
                System.out.println(VERSE_9 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 10:
                System.out.println(VERSE_10 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 11:
                System.out.println(VERSE_11 + "\nVerses remain:" + VERSES_REMAIN);
                break;
            case 12:
                System.out.println(VERSE_12 + "\nVerses remain:" + VERSES_REMAIN);
                break;


        }

    }

}


/*
On the first day of Christmas, my true love sent to me
A partridge in a pear tree

[Verse 2]
On the second day of Christmas, my true love sent to me
Two turtle doves, and
A partridge in a pear tree

[Verse 3]
On the third day of Christmas, my true love sent to me
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 4]
On the fourth day of Christmas, my true love sent to me
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 5]
On the fifth day of Christmas, my true love sent to me
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 6]
On the sixth day of Christmas, my true love sent to me
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 7]
On the seventh day of Christmas, my true love sent to me
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 8]
On the eighth day of Christmas, my true love sent to me
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 9]
On the ninth day of Christmas, my true love sent to me
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 10]
On the tenth day of Christmas, my true love sent to me
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 11]
On the eleventh day of Christmas, my true love sent to me
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 12]
On the twelfth day of Christmas, my true love sent to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves, and
A partridge in a pear tree
 */
