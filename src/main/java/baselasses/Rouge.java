package main.java.baselasses;

import main.java.baseunits.Player;

/**
 * Concrete decorator class Rouge.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Rouge extends Player {

    /**
     * Constructor for Rouge player.
     * @param name player's name
     */
    public Rouge(String name) {
        super(6, 7, 5, 2, 5);
        this.name = name;
        this.classType = "Rouge";
        skill = "Back Stab";
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
