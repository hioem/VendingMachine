package SnackBar;

import Number42.Coins;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
    // Fields:

    private int price;
    private int stock;
    private int deposit;
    private int change;
    //make a private static double variable called totalSales that has an initial value of 0 and stores the amount of money in the machine


    /**
     * Constructs a Vendor
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock)
    {
        //You need to complete this using this. notation

    }

    /**
     * Sets the quantity of items in stock.
     * @param qty number of items to place in stock (int)
     */


    public void setStock(int stock)
    {
        //You need to complete this using this. notation
    }

    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock()
    {
        //complete this
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int d)
    {
        //You need to complete this using mutator
    }

    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()
    {
        return deposit;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale()
    {
        //create the makesale method
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
    public int getChange()
    {
        int c=change;
        change=0;
        return c;
    }

    public String getChangeString()
    {
        //From Ethan: create a get method that returns the amount and type of coins that should be returned by the machine
        /*
        note that the coin class has a .getQuarters(), a .getDimes() etc etc (use the coin class!)
        */
        

        String changeString="";

        return changeString;
    }
    
    /**
    * Returns the total dollars of sales and resets the total dollars of sales to 0
    * Hint: use a temp variable
    *
    * @return dollars of sales
    */
    public static double getTotalSales()
    {
        //complete this
    }
}
