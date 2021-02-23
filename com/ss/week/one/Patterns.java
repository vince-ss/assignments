package com.ss.week.one;

public class Patterns {
    public static void main(String[] args) {
        printRightTriangle(4);
        printUpsideDownRightTriangle(4);
        printTriangle(4);
        printUpsideDownTriangle(4);
    }

    private static void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-".repeat(n*2));
    }

    private static void printUpsideDownRightTriangle(int n) {
        System.out.println("-".repeat(n*2));
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangle(int n) {
        for (int i = 0; i < n+1; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-".repeat(n*2));
    }

    private static void printUpsideDownTriangle(int n) {
        System.out.println("-".repeat(n*2));
        for (int i = n; i > 0; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
