package com.digital_nomads.codingBat.warmup1;

public class SumDouble {

    public static void main(String[] args) {

        SumDouble sumDouble = new SumDouble();
        System.out.println(sumDouble.sumDouble(4, 4));

    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }
}
