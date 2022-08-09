package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {

    public static void main(String[] args) {
        // changed birdsInPie to 1

        int birdsInPie = 1;
        for (int i = 1; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}