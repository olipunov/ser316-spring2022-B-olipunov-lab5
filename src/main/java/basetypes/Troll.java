package main.java.basetypes;

import main.java.baseunits.Player;
import main.java.baseunits.PlayerType;

/**
 * Concrete decorator for PlayerType class.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Troll extends PlayerType {

    /**
     * Constructor for unit.
     * @param player your character decorated
     */
    public Troll(Player player) {
        super(player, 0, 10, 0, 0, 0);
        this.myPlayer = player;
        player.setIntuition(player.getIntuition() + 1);
        origin = "\n" + player.getName() + " your power comes from"
                + " Amani Empire of the middle forestlands and the "
                + "Gurubashi Empire of the Southeastern jungle.\n";
        player.setType("Troll");
        player.setSkill2("Enhanced Intuition");
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
