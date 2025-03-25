/**
 * FoodItem.java
 * This is a superclass for the box store project, specifically for food items.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a general food item class for the store
 */
public class FoodItem extends StoreItem{
    //Attributes
    private int calories;
    private String expiration;

    //constructor
    /**
     * a constructor for the FoodItem class
     * @param name name of the item
     * @param serial serial number for the item
     * @param price price of the item
     * @param brand brand of the item
     * @param calories the amount of calories in an item
     * @param expiration the expiration date of an item
     */
    public FoodItem(String name, int serial, double price, String brand, int quantity, int calories, String expiration) {
        super(name, serial, price, brand, quantity);
        this.calories = calories;
        this.expiration = expiration;
        this.tax = .08
    }

    //getters-accessors
    /**
     * a getter for calories
     * @return an int with the amount of calories in the item
     */
    public int getCalories() {
        return calories;
    }

    /**
     * a getter for expiration
     * @return a string with the expiration date
     */
    public String getExpiration() {
        return expiration;
    }

    //setters-mutators
    /**
     * a setter for calories
     * @param calories the new calories value
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * a setter for expiration
     * @param expiration the new expiration date
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

}
