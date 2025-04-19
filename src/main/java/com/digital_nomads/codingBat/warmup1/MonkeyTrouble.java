package com.digital_nomads.codingBat.warmup1;

public class MonkeyTrouble {

    public static void main(String[] args) {

        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        System.out.println(monkeyTrouble.monkeyTrouble(false, false));
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }

    }

}