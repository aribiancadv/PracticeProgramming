package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        int hidingSpotIndex = squirrel.nextInt(hidingSpots.length);
        hidingSpots[hidingSpotIndex] = "Nut";
        System.out.println("The nut has been hidden ...");


        for(int i = 0; i < hidingSpots.length; i++){
            if (hidingSpots[i] == "Nut"){
                System.out.println("Found it! It's in spot #" + hidingSpotIndex);
            } else {
                continue;
            }
        }



        // Nut finding code should go here!
    }
}
