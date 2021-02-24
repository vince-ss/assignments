package com.ss.week.one;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        //Heron's Formula
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    @Override
    public void display() {
        int n = 3;
        for (int i = 0; i < n+1; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
