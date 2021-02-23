package com.ss.week.one;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(101-1) + 1;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 5; i >= 0; i--) {
            System.out.println("Guess a number: ");
            int number = keyboard.nextInt();

            if (Math.abs(randomNum - number) <= 10) {
                System.out.println("You did it! The number was: " + randomNum);
                break;
            }

            if (i != 0) {
                System.out.println("Keep trying! You have " + i + " chances left");
            } else {
                System.out.println("Sorry! The number was: " + randomNum);
            }
        }
    }
}
