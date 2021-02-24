package com.ss.week.one;

public class SumCommandLine {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
            //System.out.print(args[i]);
        }
        System.out.println("Sum is: " + sum);
    }
}
