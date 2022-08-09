package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        Random randomizer = new Random();

        int cleanRandomizer = randomizer.nextInt(101);

        int chancePercentage = 10;

        boolean cleanChance = cleanRandomizer <= chancePercentage;

        int timesAsked = 1;

        boolean isRoomClean = false;

        do {
            System.out.println("Clean your room!!" + " (x" + timesAsked++ + ")");

            if (cleanRandomizer <= chancePercentage && timesAsked < 8) {
                System.out.println("Clean Chance Percentage: " + chancePercentage + "%");
                System.out.println("Randomizer number: " + cleanRandomizer);

                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                isRoomClean = true;
            } else if(timesAsked > 7){
                System.out.println("Clean Chance Percentage: " + chancePercentage + "%");
                System.out.println("Randomizer number: " + cleanRandomizer);

                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else {
                System.out.println("Clean Chance Percentage: " + chancePercentage + "%");
                System.out.println("Randomizer number: " + cleanRandomizer);
                chancePercentage = chancePercentage + 10;
                cleanRandomizer = randomizer.nextInt(101);


            }

        } while (isRoomClean == false);

    }
}
