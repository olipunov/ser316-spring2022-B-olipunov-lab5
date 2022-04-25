package main.java;


//import main.java.BaseClasses.Hunter;
//import main.java.BaseClasses.Paladin;
//import main.java.BaseClasses.Rouge;
//import main.java.BaseClasses.Warlock;
import main.java.baselasses.Hunter;
import main.java.baselasses.Paladin;
import main.java.baselasses.Rouge;
import main.java.baselasses.Warlock;
import main.java.basetypes.Elf;
import main.java.basetypes.Human;
import main.java.basetypes.Troll;
import main.java.basetypes.Undead;
import main.java.baseunits.Player;

public class Main {

    /**
     * Starting point.
     * @param args cmd line arg
     */
    public static void main(String[] args) {
        Player player;

        System.out.println("\nHello ser316!");
        System.out.println("Welcome to Assignment 5 RPG-simulator");
        String name;
        System.out.println("Please Enter Your Name");
        name = "Oleg";
        System.out.println("Your chose " + name + " as your name");

        //Class selection
        System.out.println("\nPlease choose your class " + name + ":");
        System.out.println("1 - Paladin");
        System.out.println("2 - Rouge");
        System.out.println("3 - Warlock");
        System.out.println("4 - Hunter");

        //prompt the user for class selection
        // create scanner here
        int classChosen = 4;

        // obtain the string selected and display the user choice.
        String classChosenS = null;
        if (classChosen == 1) {
            classChosenS = "Paladin";
            player = new Paladin(name);
        } else if (classChosen == 2) {
            classChosenS = "Rouge";
            player = new Rouge(name);
        } else if (classChosen == 3) {
            classChosenS = "Warlock";
            player = new Warlock(name);
        } else {
            classChosenS = "Hunter";
            player = new Hunter(name);
        }
        System.out.println("\nYou chose: " + classChosenS);

        //Type selection
        System.out.println("\nPlease choose your type:");
        System.out.println("1 - Troll");
        System.out.println("2 - Undead");
        System.out.println("3 - Human");
        System.out.println("4 - Elf");

        //prompt the user for type selection
        // create scanner here
        int typeChosen = 4;

        // obtain the string selected and display the user choice.
        String typeChosenS = null;
        Player completePlayer;
        if (typeChosen == 1) {
            typeChosenS = "Troll";
            completePlayer = new Troll(player);
        } else if (typeChosen == 2) {
            typeChosenS = "Undead";
            completePlayer = new Undead(player);
        } else if (typeChosen == 3) {
            typeChosenS = "Human";
            completePlayer = new Human(player);
        } else {
            typeChosenS = "Elf";
            completePlayer = new Elf(player);
        }
        System.out.println("\nYou chose: " + typeChosenS + " who is a " + classChosenS);



        System.out.println(completePlayer.toString());
        System.out.print("Your special ability is ");
        System.out.println(completePlayer.ability());
        System.out.print("Your faction bonus is ");
        System.out.println(completePlayer.ability2());

        int counter = 1;
        while (true) {
            System.out.println("\nin loop");

            Battle.getInstance(completePlayer, counter);
            counter++;
            if (counter >= 22) {
                break;
            }
        }


    }
}
