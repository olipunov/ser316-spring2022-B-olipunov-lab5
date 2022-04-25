package main.java.baseunits;

/**
 * This is the decorator Base Class.
 * @author : Oleg
 * @version : 4/23/2022, Saturday
 **/
public abstract class PlayerType extends Player {

    protected Player player;

    protected String origin;

    /**
     * Constructor for player.
     * @param strength     responsible for physical dmg
     * @param agility      responsible for dodge and anti-dodge
     * @param intuition    responsible for critical hit and anti-critical hit
     * @param intelligence responsible for mana pool and magical dmg
     * @param vitality responsible for health pool
     */
    public PlayerType(Player player, int strength, int agility, int intuition,
                      int intelligence, int vitality) {
        super(strength, agility, intuition, intelligence, vitality);
        this.player = player;
    }

    public String bio() {
        return player.bio() + "Primary Skill: " + ability() + origin;
    }

    public int getStrength() {
        return strength + player.getStrength();
    }

    public int getAgility() {
        return strength + player.getAgility();
    }

    public int getIntuition() {
        return strength + player.getIntuition();
    }

    public int getIntelligence() {
        return strength + player.getIntelligence();
    }

    public int getVitality() {
        return strength + player.getVitality();
    }

    public String getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return bio() + "\n***Stats*** " + "\nStrength: " + getStrength() + "\nAgility: "
                + getAgility() + "\nIntuition: " + getIntuition() + "\nIntelligence: "
                + getIntelligence() + "\nVitality: " + getVitality() + "\n";
    }

    public int setVitality() {
        return strength + player.getVitality();
    }

}
