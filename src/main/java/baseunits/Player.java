package main.java.baseunits;

/**
 * Our base player class, will be used by the decorator to build up from here.
 * @author : Oleg
 * @version : 4/21/2022, Thursday
 **/
public abstract class Player {

    // Player's attributes
    protected String name;
    protected String classType;
    protected String type;
    protected String typeBonus;
    protected int strength;
    protected int agility;
    protected int intuition;
    protected int intelligence;
    protected int vitality;
    protected String skill;
    protected String skill2;

    public abstract String ability();

    public abstract String ability2();

    /**
     * Display player's bio.
     * @return player name, type, and class
     */
    public String bio() {
        return name + " is a " + type + " " + classType + "\n";
    }

    /**
     * Constructor for player.
     * @param strength responsible for physical dmg
     * @param agility responsible for dodge and anti-dodge
     * @param intuition responsible for critical hit and anti-critical hit
     * @param intelligence responsible for mana pool and magical dmg
     */
    public Player(int strength, int agility, int intuition, int intelligence, int vitality) {
        this.strength = strength;
        this.agility = agility;
        this.intuition = intuition;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    /**
     * Getter for name.
     * @return player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name set players name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for player's class.
     * @return class type
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Setter for player's class.
     * @param classType set players class
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * Getter for player's type.
     * @return character type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for player's type.
     * @param type character type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for bonus type of the player.
     * @return players type bonus
     */
    public String getTypeBonus() {
        return typeBonus;
    }

    /**
     * Setter for a bonus type of the player.
     * @param typeBonus players type bonus
     */
    public void setTypeBonus(String typeBonus) {
        this.typeBonus = typeBonus;
    }

    /**
     * Getter for player's strength.
     * @return player's current strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Setter for player's strength.
     * @param strength player's current strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Getter for player's agility.
     * @return player's current agility
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Setter for player's agility.
     * @param agility player's current agility
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * Getter for player's intuition.
     * @return player's current intuition
     */
    public int getIntuition() {
        return intuition;
    }

    /**
     * Setter for player's intuition.
     * @param intuition player's current intuition
     */
    public void setIntuition(int intuition) {
        this.intuition = intuition;
    }

    /**
     * Getter for player's intelligence.
     * @return player's current intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Setter for player's intelligence.
     * @param intelligence player's current intelligence
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Displays bio of the player  classs.
     * @return
     */
    public String toString() {
        return bio() + " ***Stats***" + "\nStrength: " + getStrength()
                + "\nAgility: " + getAgility()
                + "\nIntuition: " + getIntuition() + "\nIntelligence: "
                + getIntelligence() + "\n";
    }

    public int getVitality() {
        return vitality;
    }

    public String getAbility() {
        return this.ability();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill2() {
        return skill2;
    }
}
