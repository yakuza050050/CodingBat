package com.digital_nomads.codingBat.warmup1;

public class SleepIn {
    public static void main(String[] args) {

        SleepIn sleepIn = new SleepIn();
        System.out.println(sleepIn.sleepInSolution(true, false));
    }


   public boolean sleepInSolution(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }

}