/**
 * Outerwear.java
 * This is a subclass for the box store project, specifically for the clothing item outerwear.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a specific outerwear class
 */
public class Outerwear extends ClothingItem{
    //Attributes
    private int tempRating;

    //constructor
    /**
     * a constructor for the Outerwear class
     * @param name the name of the item
     * @param serial the serial number for the item
     * @param price the price of an item
     * @param brand the brand of the item
     * @param quantity the amount of the item
     * @param size the size of the clothing item
     * @param color the color of the clothing item
     * @param material the material of the clothing item
     * @param tempRating an int of the temperature rating of the clothing
     */
    public Outerwear(String name, int serial, double price, String brand, int quantity, String size, String color, String material, int tempRating) {
        super(name, serial, price, brand, quantity, size, color, material);
        this.tempRating = tempRating;
    }

    //Accessor
    /**
     * a getter for tempRating
     * @return an int of the temperature rating
     */
    public int getTempRating() {
        return tempRating;
    }

    //Mutator
    /**
     * a setter for tempRating
     * @param tempRating the new desired temperature rating
     */
    public void setTempRating(int tempRating) {
        this.tempRating = tempRating;
    }
}
