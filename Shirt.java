/**
 * Shirt.java
 * This is a subclass for the box store project, specifically for the clothing item shirt.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a specific shirt class
 */
public class Shirt extends ClothingItem{
    //Attributes
    private String sleeveType;

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
     * @param sleeveType the type od sleeve on the shirt
     */
    public Shirt(String name, int serial, double price, String brand, int quantity, String size, String color, String material, String sleeveType) {
        super(name, serial, price, brand, quantity, size, color, material);
        this.sleeveType = sleeveType;
    }

    //Accessor
    /**
     * a getter for sleeveType
     * @return a string of the sleeveType for the shirt
     */
    public String getSleeveType() {
        return sleeveType;
    }

    //Mutator
    /**
     * a setter for SleeveType
     * @param sleeveType the new desired SleeveType
     */
    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }
}
