package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(51) + 50 + ", "); //effectively the same
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));

        int num01 = randomizer.nextInt(100);
        int num02 = randomizer.nextInt(100);


        System.out.println(num01 + " + " + num02 + " = " + (num01 + num02)); //can use random int in math statement

        double num03 = randomizer.nextDouble(100);
        double num04 = randomizer.nextDouble(100);


        System.out.println(num03 + " + " + num04 + " = " + (num03 + num04)); //can use random double in math statement


    }
}
