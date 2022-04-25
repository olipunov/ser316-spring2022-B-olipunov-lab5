package main.java.baselasses;

import main.java.baseunits.Player;

/**
 * This is concrete decorator class Paladin.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Paladin extends Player {

    /**
     * Constructor for Paladin player.
     * @param name         player's name
     */
    public Paladin(String name) {
        super(7, 3, 5, 5, 5);
        this.name = name;
        this.classType = "Paladin";
        skill = "Healing Hand";
    }

    @Override
    public String ability() {
        return "";
    }

    @Override
    public String ability2() {
        return "";
    }
}
