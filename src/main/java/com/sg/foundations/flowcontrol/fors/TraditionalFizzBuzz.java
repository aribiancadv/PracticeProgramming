package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;
import java.util.Random;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner inputReader = new Scanner(System.in);
        int userNumber;

        System.out.println("Please input an integer:");
        userNumber = Integer.parseInt(inputReader.nextLine());

        for (int i = 0; i < userNumber; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            } else if (i % 3 == 0){
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }

        }
        System.out.println("TRADITION!!!");

    }
}
