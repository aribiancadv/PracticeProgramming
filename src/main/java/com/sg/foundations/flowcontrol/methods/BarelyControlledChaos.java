package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {
        String colour = colourPicker("Red", "Green", "Blue", "Magenta", "Yellow");

        String animal = animalPicker("Leopard", "Cheetah", "Elephant", "Shark", "Eagle");

        String colourAgain = colourPicker("Fuchsia", "Cyan", "Black", "White", "Purple");

        int weight = randomInt(5, 200);

        int distance = randomInt(10, 20);

        int number = randomInt(10000, 20000);

        int time = randomInt(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + colour + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colourAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String colourPicker(String colour1, String colour2, String colour3, String colour4, String colour5){
        String[] colourList = {colour1, colour2, colour3, colour4, colour5};
        Random randomizer = new Random();
        int chosenColour = randomizer.nextInt(colourList.length);

        return colourList[chosenColour];

    }

    public static String animalPicker(String animal1, String animal2, String animal3, String animal4, String animal5){
        String[] animalList = {animal1, animal2, animal3, animal4, animal5};
        Random randomizer = new Random();
        int chosenAnimal = randomizer.nextInt(animalList.length);

        return animalList[chosenAnimal];

    }

    public static int randomInt(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
