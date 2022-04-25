package main.java.basetypes;

import main.java.baseunits.Player;
import main.java.baseunits.PlayerType;

/**
 * Concrete decorator for PlayerType class.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Human extends PlayerType  {

    /**
     * Constructor for player.
     *
     * @param player your character decorated
     */
    public Human(Player player) {
        super(player, 0, 10, 0, 0, 0);
        this.myPlayer = player;
        player.setStrength(player.getStrength() + 1);
        origin = "\n" + player.getName() + " your power comes from derive from "
                + "the ancient servitors of the Titans, and their origins "
                + "lie in the frozen continent of Northrend\n";
        player.setType("Human");
        player.setSkill2("Enhanced Strength");
    }

    Player myPlayer;

    @Override
    public String ability() {
        return myPlayer.getSkill();
    }

    @Override
    public String ability2() {
        return myPlayer.getSkill2();
    }


}
