package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field WEST of a white house");
        System.out.println("with a boarded front door.");
        System.out.println("To the SOUTH lies Edoras, capital of the Kingdom of Rohan.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go WEST to the house, SOUTH to Edoras, or OPEN the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("OPEN")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } else if (action.contains("WEST")) {
            System.out.println("You go WEST to the white house.");
            System.out.println("The front door is boarded shut.");
            System.out.println("Do you BASH the front door or LOOK for another way in?");
            action = userInput.nextLine();

            if (action.contains("BASH")) {
                System.out.println("You try to BASH the front door open.");
                System.out.println("It's boarded up with Australian Buloke, the hardest wood known to humankind.");
                System.out.println("Your hand shatters into a thousand pieces. You are in agony.");
                System.out.println("You pass out into the oblivion of death.");

            } else if (action.contains("LOOK")){
                System.out.println("You LOOK around for another way in,");
                System.out.println("realising the front door was made of Australian Buloke,");
                System.out.println("the hardest wood known to humankind.");
                System.out.println("You find an open window.");
                System.out.println("Just as you're about to jump in, you see a rabid monster inside.");
                System.out.println("You walk away and go back to your life.");

            }


        } else if (action.contains("SOUTH")) {
                System.out.println("As you traverse SOUTH, you go over the hill and you see...");
                System.out.println("Edoras! Home of the horse-lords of Rohan.");
                System.out.println("You approach the gates, but the guards block your way.");
                System.out.println("The taller guard speaks:");
                System.out.println("'To enter, traveller, you must answer a question.'");
                System.out.println("'Do you LIKE horses? Or do you HATE them?'");
                action = userInput.nextLine();

                if (action.contains("LIKE")){
                    System.out.println("You tell the tall guard that you like horses.");
                    System.out.println("The tall guard looks at his comrade, they both smile.");
                    System.out.println("They make way for you to enter Edoras. A new adventure awaits!");
                } else if (action.contains("HATE")) {
                    System.out.println("The tall guard looks on you scornfully.");
                    System.out.println("The short guard looks on you even more scornfully.");
                    System.out.println("The tall guard gets closer to you, you prepare for a fight.");
                    System.out.println("Instead of battling you, however, the tall guard leans very close to your ear, and whispers:");
                    System.out.println("'Get the FUCK out of here.'");
                    System.out.println("You leave, with the shame of having disappointed the horse-lords of Rohan haunting you.");
                }
        }
    }
}