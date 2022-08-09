package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {

    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner inputReader = new Scanner(System.in);
        int userNum;
        boolean isCorrect = false;


        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        int num = randomizer.nextInt(201) - 100;



        while (isCorrect == false) {
            System.out.println("Your Guess:");
            userNum = Integer.parseInt(inputReader.nextLine());

            System.out.println("You guessed " + userNum);

            if (num == userNum) {
                System.out.println("Wow, nice guess! That was it!");
                isCorrect = true;

            } else if (num > userNum) {
                System.out.println("Ha, nice try - too low! Try again!");
                isCorrect = false;
            } else if (num < userNum) {
                System.out.println("Whoa there, sailor! That's too high! Try again!");
                isCorrect = false;
            }
        }

    }

}
