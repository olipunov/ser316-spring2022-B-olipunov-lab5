package main.java.basetypes;

import main.java.baseunits.Player;
import main.java.baseunits.PlayerType;

/**
 * Concrete decorator for PlayerType class.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Undead extends PlayerType  {

    /**
     * Constructor for player.
     * @param player your character decorated
     */
    public Undead(Player player) {
        super(player, 0, 0, 0, 0, 0);
        this.myPlayer = player;
        player.setIntelligence(player.getIntelligence() + 1);
        origin = "\n" + player.getName() + " your power comes from the Lych King.\n";
        player.setType("Undead");
        player.setSkill2("Enhanced Intelligence");
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
