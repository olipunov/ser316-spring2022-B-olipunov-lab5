package main.java;

/**
 * Singleton Class monoey, perfect design pattern for this,
 * since we only need a single instance of money.
 *
 * @author : Oleg
 * @version : 4/24/2022, Sunday
 **/
public class Money {
    private static int money = 0;

    /**
     * Get current money available.
     *
     * @return money on account
     */
    public static int getMoney() {
        return money;
    }

    /**
     * Set money to new amount.
     *
     * @param newMoney new total money
     */
    public static void setMoney(int newMoney) {
        money = newMoney;
    }

    /**
     * Add money after opening golden chests.
     *
     * @param newMoney money found in chest
     * @return total money
     */
    public static int addMoney(int newMoney) {
        money += newMoney;
        return money;
    }

}
