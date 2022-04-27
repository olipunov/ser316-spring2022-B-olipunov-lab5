package main.java;

import java.util.Random;

import main.java.baselasses.Hunter;
import main.java.baselasses.Paladin;
import main.java.baselasses.Rouge;
import main.java.baselasses.Warlock;
import main.java.basetypes.Elf;
import main.java.basetypes.Human;
import main.java.basetypes.Troll;
import main.java.basetypes.Undead;
import main.java.baseunits.Player;

/**
 * This class is a Singleton class and Mediator class all together.
 * Battle takes two classes Player and Enemy and makes them fight.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Battle {
    /*The main player of the rpg game */
    static Player mainPlayer;
    static Battle battle;
    static boolean outcome = true;

    /**
     * Instance of the battle simulate a fight.
     * @param player your character
     * @param lvl current dngeon lvl
     * @return battle outcome
     */
    public static Battle getInstance(Player player, int lvl) {

        outcome = true;
        int enemyFacing = 1;
        double playerDmg = 5;
        playerDmg = setDmg(player.getStrength());
        int playerHealth = 5;
        playerHealth = setHealth(player.getVitality());
        double playerDodge = 5;
        playerDodge = setDodge(player.getAgility());
        double playerCrit = 5;
        playerCrit = setCrit(player.getIntuition());
        int playerMana = 5;
        playerMana = setMana(player.getIntelligence());

        Random rand = new Random(); //instance of random class
        int upperbound = lvl + 1;
        //generate random values from 0-24
        final int enemyType = rand.nextInt(3) + 1;
        final int enemyClass = rand.nextInt(3) + 1;
        int intRandom = rand.nextInt(upperbound);

        System.out.println("*************** Welcome to flor: " + lvl + " ***************");

        if (lvl % 10 == 0) {
            enemyFacing = 3;
            System.out.println("BOSS LVL");
        } else if (lvl % 5 == 0) {
            System.out.println("medium LVL");
            enemyFacing = 2;
        } else {
            System.out.println("regular LVL");
        }

        System.out.println("Enemies on this floor will have stats bonus"
                + " from 0 to " + (upperbound - 1));

        Battle.mainPlayer = player;
        battle = new Battle();

        Player enemy;
        String name = "Enemy lvl " + lvl;
        if (enemyClass == 1) {
            enemy = new Paladin(name);
        } else if (enemyClass == 2) {
            enemy = new Rouge(name);
        } else if (enemyClass == 3) {
            enemy = new Warlock(name);
        } else {
            enemy = new Hunter(name);
        }
        Player completeEnemy;
        if (enemyType == 1) {
            completeEnemy = new Troll(enemy);
        } else if (enemyType == 2) {
            completeEnemy = new Undead(enemy);
        } else if (enemyType == 3) {
            completeEnemy = new Human(enemy);
        } else {
            completeEnemy = new Elf(enemy);
        }

        if (enemyFacing == 3) {
            completeEnemy.setStrength(completeEnemy.getStrength() + lvl * 10);
        } else if (enemyFacing == 2) {
            completeEnemy.setStrength(completeEnemy.getStrength() + lvl * 2);
        } else {
            completeEnemy.setStrength(completeEnemy.getStrength() + lvl);
        }

        System.out.println("This lvl you are facing");
        System.out.println(completeEnemy);

        double enemyDmg = 5;
        enemyDmg = setDmg(completeEnemy.getStrength());
        int enemyHealth = 5;
        enemyHealth = setHealth(completeEnemy.getVitality());
        double enemyDodge = 5;
        enemyDodge = setDodge(completeEnemy.getAgility());
        double enemyCrit = 5;
        enemyCrit = setCrit(completeEnemy.getIntuition());
        int enemyMana = 5;
        enemyMana = setMana(completeEnemy.getIntelligence());

        System.out.println("=======Enemy======");
        System.out.format("Dmg: %.1f%n", enemyDmg);
        System.out.format("Speed: %.1f%n", enemyDodge);
        System.out.format("Crit: %.1f%n", enemyCrit);
        System.out.println("HP: " + enemyHealth);
        System.out.println("Mana: " + enemyMana);
        System.out.println("\tVS");
        System.out.println("=======Player======");
        System.out.format("Dmg: %.1f%n", playerDmg);
        System.out.format("Speed: %.1f%n", playerDodge);
        System.out.format("Crit: %.1f%n", playerCrit);
        System.out.println("HP: " + playerHealth);
        System.out.println("Mana: " + playerMana);
        System.out.println();

        /**
         * The battle starts here
         */
        System.out.println("Fight Starts!");
        boolean  playerTurn = (playerDodge >= enemyDodge);
        while (true) {
            outcome = true;
            // Calculate who goes first based  on speed/agility
            // Unit With highest speed goes first
            boolean doesCrit = false;
            double dmgDone;

            // Player's turn
            if (playerTurn) {
                dmgDone = playerDmg;
                System.out.println("It's your turn");
                int percentage = rand.nextInt(101);
                int percentage2 = rand.nextInt(101);

                if (percentage <= enemyDodge - playerDodge) {
                    System.out.println("Swoosh.. Enemy Dodged Your Attack!\n");
                    playerTurn = false;
                    continue;
                }

                if (playerMana >= 10) {
                    System.out.print("You use your primary ability! ");
                    System.out.println(player.ability());
                    playerMana -= 10;
                    System.out.println("Mana Remaining " + playerMana);
                    dmgDone *= 1.5;
                }

                if (percentage2 <= playerCrit - enemyCrit) {
                    System.out.println("CRIT! You deal double dmg.");
                    dmgDone *= 2;
                }

                System.out.println("Dmg done: " + dmgDone);
                enemyHealth =  enemyHealth - (int)dmgDone;
                if (enemyHealth < 0) {
                    enemyHealth = 0;
                }
                System.out.println("Enemy Health Remaining: " + enemyHealth);

                playerTurn = false;

            } else { //Enemy's Turn
                dmgDone = enemyDmg;
                System.out.println("It's enemy's turn");
                int percentage = rand.nextInt(101);
                int percentage2 = rand.nextInt(101); // used for crit

                // calculate dodge
                if (percentage <= playerDodge - enemyDodge) {
                    System.out.println("Swoosh.. You Dodged Enemy's Attack!\n");
                    playerTurn = true;
                    continue;
                }

                if (enemyMana >= 10) {
                    System.out.print("Enemy use primary ability! ");
                    System.out.println(completeEnemy.ability());
                    enemyMana -= 10;
                    System.out.println("Mana Remaining " + enemyMana);
                    dmgDone *= 1.5;
                }

                if (percentage2 <= enemyCrit - playerCrit) {
                    System.out.println("CRIT! Enemy deal double dmg.");
                    dmgDone *= 2;
                }

                System.out.println("Dmg done: " + dmgDone);
                playerHealth = playerHealth - (int)dmgDone;
                if (playerHealth < 0) {
                    playerHealth = 0;
                }
                System.out.println("Your Remaining Health: " + playerHealth);

                playerTurn = true;
            }
            System.out.println();


            if (playerHealth <= 0 || enemyHealth <= 0) {
                if (playerHealth <= 0) {
                    System.out.println("*** You Lost ***");
                    outcome = false;
                } else {
                    System.out.println("*** You Wont the battle. ***");
                }
                break;
            }
        }

        if (enemyType == enemyClass) {
            int i = lvl + intRandom;
            System.out.println("\nWOOOO HOOO YOU FOUND A GOLDEN CHEST!!!");
            System.out.println("YOU OPEN A CHEST TO FIND " + i + " GOLD COINS");
            Money.addMoney(i);
            System.out.println("You  now have " + Money.getMoney() + " GOLD COINS in total.\n");
        }

        System.out.println("\nYOUR LVL INCREASED!");
        player.setStrength(player.getStrength() + 1);
        System.out.println(player);
        System.out.println("Returning From the Dungeon");
        return battle;

    }

    /**
     * Convert vitality into health for the battle.
     * @param vitality max health
     * @return current health
     */
    public static int setHealth(int vitality) {
        return vitality * 10;
    }

    /**
     * Convert str into dmg.
     * @param strength current str
     * @return dmg
     */
    public static double setDmg(int strength) {
        return strength * 0.9;
    }

    /**
     * Convert agility into dodge and anti dodge.
     * @param agility max dodge
     * @return dodge
     */
    public static double setDodge(int agility) {
        return agility * .4;
    }

    /**
     * Convert intuition into crit and anti-crit.
     * @param intuition max int points
     * @return crit
     */
    public static double setCrit(int intuition) {
        return intuition * .4;
    }

    /**
     * Convert intelligence into mana.
     * @param intelligence curr int points
     * @return mana
     */
    public static int setMana(int intelligence) {
        return intelligence * 5;
    }

}
