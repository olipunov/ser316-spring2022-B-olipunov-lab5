package main.java.baselasses;

import main.java.baseunits.Player;

/**
 * Concrete decorator class Warlock.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Warlock extends Player {

    /**
     * Constructor for Warlock player.
     * @param name player's name
     */
    public Warlock(String name) {
        super(2, 4, 5, 9, 5);
        this.name = name;
        this.classType = "Warlock";
        skill = "Life Drain";
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
