package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String noun;
        String adjective;
        String anotherNoun;
        int numberValue;
        String anotherAdjective;
        String pluralNoun;
        String anotherPluralNoun;
        String anotherAnotherPluralNoun;
        String verbInfinitive;
        String verbParticiple;


        System.out.println("Let's play MAD LIBS!");

        System.out.println("I need a noun: ");
        noun = inputReader.nextLine();

        System.out.println("Now an adjective: ");
        adjective = inputReader.nextLine();

        System.out.println("Another noun: ");
        anotherNoun = inputReader.nextLine();

        System.out.println("And a number: ");
        numberValue = Integer.parseInt(inputReader.nextLine());

        System.out.println("Another adjective: ");
        anotherAdjective = inputReader.nextLine();

        System.out.println("A plural noun: ");
        pluralNoun = inputReader.nextLine();

        System.out.println("Another one: ");
        anotherPluralNoun = inputReader.nextLine();

        System.out.println("One more: ");
        anotherAnotherPluralNoun = inputReader.nextLine();

        System.out.println("A verb (infinitive form): ");
        verbInfinitive = inputReader.nextLine();

        System.out.println("Same verb (past participle): ");
        verbParticiple = inputReader.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");

        System.out.println(noun + ": the " + adjective + " frontier. These are the voyages of the starship "
                + anotherNoun + ". Its " + numberValue + "-year mission: to explore strange " + anotherAdjective +
                " " + pluralNoun + ", to seek out " + anotherAdjective + " " + anotherPluralNoun + " and " + anotherAdjective +
                " " + anotherAnotherPluralNoun +", to boldly " + verbInfinitive + " where no one has " + verbParticiple + " before.");




    }

}
