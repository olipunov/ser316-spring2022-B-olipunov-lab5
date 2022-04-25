package main.java.basetypes;

import main.java.baseunits.Player;
import main.java.baseunits.PlayerType;

/**
 * Concrete decorator for PlayerType class.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public class Elf extends PlayerType  {

    /**
     * Constructor for player.
     *
     * @param player your character decorated
     */
    public Elf(Player player) {
        super(player, 0, 10, 0, 0, 0);
        this.myPlayer = player;
        player.setAgility(player.getAgility() + 1);
        origin = "\n" + player.getName() + " originally a dark troll "
                + "transformed by the Well of Eternity";
        player.setType("Elf");
        player.setSkill2("Enhanced Agility");
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
