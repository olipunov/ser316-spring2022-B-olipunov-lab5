package main.java.baselasses;

import main.java.baseunits.Player;

/**
 * Concrete decorator class Hunter.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Hunter extends Player {

    /**
     * Constructor for Hunter player.
     * @param name player's name
     */
    public Hunter(String name) {
        super(4, 7, 5, 4, 5);
        this.name = name;
        this.classType = "Hunter";
        skill = "Head Shot";
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