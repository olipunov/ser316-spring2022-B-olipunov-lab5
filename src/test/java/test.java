/**
* Test class for the JUnit tests that are testing different parts of  RPG game software.
*
* @author olipunov
*/

package test.java;


import com.sun.source.tree.NewArrayTree;
import main.java.baselasses.Hunter;
import main.java.baselasses.Paladin;
import main.java.baselasses.Rouge;
import main.java.baselasses.Warlock;
import main.java.basetypes.Elf;
import main.java.basetypes.Human;
import main.java.basetypes.Troll;
import main.java.basetypes.Undead;
import main.java.baseunits.Player;
import main.java.baseunits.PlayerType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Class for JUnit testing page for RPG desktop application.
 * @author : Oleg Lipunov
 * @version : 4/24/2022, Sunday
 **/
public class test {

    // For Player class
    private Player current;
    private PlayerType playerType;
    private Hunter hunter;
    private Paladin paladin;
    private Rouge rouge;
    private Warlock warlock;

    private Elf elf;
    private Human human;
    private Troll troll;
    private Undead undead;

    /**
     * Condition before the test.
     * @throws Exception Throw general exception
     */
    @org.junit.Before
    public void beforeMethod() throws Exception {
        current = new Hunter("Oleg");
    }

    /**
     * Tear down method to dispose of player object after each test
     * @author oleg
     * @throws java.lang.Exception  Throws general exception
     */
    @org.junit.After
    public void afterMethod() throws Exception{
        current = null;
        playerType = null;

    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    /**
     * TEST CASE 1:  Checking player classes class making sure they are created properly and correct.
     * @author oleg lipunov
     */
    @Test
    public void testPlayer() {
        Assert.assertEquals("Oleg", current.getName());
        Assert.assertEquals("", current.ability());
        Assert.assertEquals("", current.ability2());
        current = new Paladin("Oleg");
        Assert.assertEquals("Oleg", current.getName());
        Assert.assertEquals("", current.ability());
        Assert.assertEquals("", current.ability2());
        current = new Rouge("Oleg");
        Assert.assertEquals("Oleg", current.getName());
        Assert.assertEquals("", current.ability());
        Assert.assertEquals("", current.ability2());
        current = new Warlock("Oleg");
        Assert.assertEquals("Oleg", current.getName());
        Assert.assertEquals("", current.ability());
        Assert.assertEquals("", current.ability2());
        System.out.println(current.getName());
        System.out.println(current.bio());
        System.out.println(current.getSkill());
        System.out.println(current.getSkill2());

        Assert.assertTrue(current.getSkill().equals("Life Drain"));
        Assert.assertTrue(!current.bio().equals("Oleg is a null Warlock"));
        try{
            Assert.assertTrue(current.getSkill2().equals(null));
        } catch (NullPointerException e) {

        }
        Assert.assertEquals("", current.ability());
        Assert.assertEquals("", current.ability2());

    }

    /**
     * TEST CASE 2:  Checking player types class making sure they are created properly and correct.
     * @author oleg lipunov
     */
    @Test
    public void testTypes() {

        current = new Paladin("Oleg");
        playerType = new Elf(current);
        System.out.println(playerType.ability());
        System.out.println(playerType.ability2());
        Assert.assertFalse(!current.getName().equals("Oleg"));
        Assert.assertEquals("Healing Hand", playerType.ability());
        Assert.assertEquals("Enhanced Agility", playerType.ability2());
        playerType = new Human(current);
        System.out.println(playerType.ability());
        System.out.println(playerType.ability2());
        Assert.assertTrue(current.getName().equals("Oleg"));
        Assert.assertEquals("Healing Hand", playerType.ability());
        Assert.assertEquals("Enhanced Strength", playerType.ability2());
        playerType = new Undead(current);
        System.out.println(playerType.ability());
        System.out.println(playerType.ability2());
        Assert.assertFalse(!current.getName().equals("Oleg"));
        Assert.assertEquals("Healing Hand", playerType.ability());
        Assert.assertEquals("Enhanced Intelligence", playerType.ability2());
        playerType = new Troll(current);
        System.out.println(playerType.ability());
        System.out.println(playerType.ability2());
        Assert.assertFalse(!current.getName().equals("Oleg"));
        Assert.assertEquals("Healing Hand", playerType.ability());
        Assert.assertEquals("Enhanced Intuition", playerType.ability2());
    }

    /**
     * TEST CASE 3:  Checking player base classes making sure they are created properly and correct.
     * @author oleg lipunov
     */
    @Test
    public void testBaseUintPlayer() {

        current = new Paladin("Oleg");
        System.out.println(current.getAgility());
        Assert.assertEquals(3, current.getAgility());
        System.out.println(current.getStrength());
        Assert.assertEquals(7, current.getStrength());
        System.out.println(current.getIntuition());
        Assert.assertEquals(5, current.getIntuition());
        System.out.println(current.getIntelligence());
        Assert.assertEquals(5, current.getIntelligence());
        System.out.println(current.getVitality());
        Assert.assertEquals(5, current.getVitality());
        System.out.println(current.getTypeBonus());
        Assert.assertNull(current.getTypeBonus());
        System.out.println(current.getType());
        Assert.assertNull(current.getType());
        System.out.println(current.getClassType());
        Assert.assertEquals("Paladin", current.getClassType());
        current.setTypeBonus("bazooka");
        System.out.println(current.getTypeBonus());
        Assert.assertEquals("bazooka", current.getTypeBonus());
        current.setClassType("smerch");
        System.out.println(current.getClassType());
        Assert.assertEquals("smerch", current.getClassType());
        System.out.println(current.toString());
        Assert.assertNotNull(current.toString());
        current.setName("Vasia");
        System.out.println(current.getName());
        Assert.assertEquals("Vasia", current.getName());
        System.out.println(current.getAbility());
        Assert.assertNotNull(current.getAbility());

    }

}
