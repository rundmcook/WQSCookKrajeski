/**
 * Shoe.java
 * This is a subclass for the box store project, specifically for the clothing item shoe.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a specific shoe class
 */
public class Shoe extends ClothingItem{
    //Attributes
    private String purpose;

    //constructor
    /**
     * a constructor for the Shoe class
     * @param name the name of the item
     * @param serial the serial number for the item
     * @param price the price of an item
     * @param brand the brand of the item
     * @param quantity the amount of the item
     * @param size the size of the clothing item
     * @param color the color of the clothing item
     * @param material the material of the clothing item
     * @param purpose the purpose of the shoe
     */
    public Shoe(String name, int serial, double price, String brand, int quantity, String size, String color, String material, String purpose) {
        super(name, serial, price, brand, quantity, size, color, material);
        this.purpose = purpose;
    }

    //Accessor
    /**
     * a getter for purpose
     * @return a string of the purpose for the shoe
     */
    public String getPurpose() {
        return purpose;
    }

    //Mutator
    /**
     * a setter for purpose
     * @param purpose the new desired purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
