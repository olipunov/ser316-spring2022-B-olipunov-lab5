package main.java;

import java.sql.SQLOutput;
import java.util.Random;

import main.java.baseunits.Player;

/**
 * This is a singleton class that will hold random generated items for sale.
 *
 * @author : Oleg
 * @version : 4/24/2022, Sunday
 **/
public class Shop {

    /*The main player of the rpg game */
    static Shop shop;

    /**
     * This method starts the shop class where player can buy items.
     *
     * @param player current player in the game
     * @return
     */
    public static Shop getShop(Player player) {
        shop = new Shop();
        Random rand = new Random();
        final int item1 = rand.nextInt(3) + 1;
        final int item2 = rand.nextInt(3) + 1;
        final int item3 = rand.nextInt(3) + 1;

        String itemOne = itemConverter(item1);
        String itemTwo = itemConverter(item2);
        String itemThree = itemConverter(item3);

        System.out.println("\nWelcome to the Magic Shop!");
        System.out.println("Choose 1 item to purchase");
        System.out.println("Here are the available items:");
        System.out.println("1: " + itemOne + " - " + itemCost(itemOne) + " Gold Coins");
        System.out.println("2: " + itemTwo + " - " + itemCost(itemTwo) + " Gold Coins");
        System.out.println("3: " + itemThree + " - " + itemCost(itemThree) + " Gold Coins");

        final int chosenItem = rand.nextInt(2) + 1;
        System.out.println("\nYou chose item  " + chosenItem);

        String itemToBuy = null;

        if (chosenItem == 1) {
            itemToBuy = itemOne;
        } else if (chosenItem == 2) {
            itemToBuy = itemTwo;
        } else {
            itemToBuy = itemThree;
        }

        if (Money.getMoney() >= itemCost(itemToBuy)) {
            System.out.println("You had enough money to buy the item.");
            if (itemToBuy.equals("1 lvl up")) {
                player.setStrength(player.getStrength() + 1);
            } else if (itemToBuy.equals("dmg bonus")) {
                player.setStrength(player.getStrength() + 2);
            } else if (itemToBuy.equals("health bonus")) {
                player.setStrength(player.getStrength() + 5);
            } else {
                player.setStrength(player.getStrength() + 10);
            }

        } else {
            System.out.println("You do not have enough money to buy the item.");
        }


        return shop;
    }

    /**
     * This method converts randomly generated int into an item String.
     *
     * @param item int representation of item
     * @return String representation of item
     */
    public static String itemConverter(int item) {
        if (item == 1) {
            return "1 lvl up";
        } else if (item == 2) {
            return "dmg bonus";
        } else if (item == 3) {
            return "health bonus";
        } else {
            return "10 lvl bonus";
        }
    }

    /**
     * This method coverts String item into gold cost for that item.
     *
     * @param item String of item to buy
     * @return cost of the specific item
     */
    public static int itemCost(String item) {
        if (item.equals("1 lvl up")) {
            return 1;
        } else if (item.equals("dmg bonus")) {
            return 2;
        } else if (item.equals("health bonus")) {
            return 5;
        } else {
            return 10;
        }
    }


}
