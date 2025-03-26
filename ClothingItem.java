/**
 * ClothingItem.java
 * This is a superclass for the box store project, specifically for clothing items.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a general clothing item class for the store
 */
public class ClothingItem extends StoreItem{
    //Attributes
    private String size;
    private String color;
    private String material;

    //Constructor
    /**
     * a constructor for the ClothingItem class
     * @param name the name of the item
     * @param serial the serial number for the item
     * @param price the price of an item
     * @param brand the brand of the item
     * @param quantity the amount of the item
     * @param size the size of the clothing item
     * @param color the color of the clothing item
     * @param material the material of the clothing item
     */
    public ClothingItem(String name, int serial, double price, String brand, int quantity, String size, String color, String material) {
        super(name, serial, price, brand, quantity);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    //Accessors
    /**
     * a getter for size
     * @return a string with the size
     */
    public String getSize() {
        return size;
    }

    /**
     * a getter for color
     * @return a string with the color of the item
     */
    public String getColor() {
        return color;
    }

    /**
     * a getter for material
     * @return a string with the material of the item
     */
    public String getMaterial() {
        return material;
    }


    //Mutators
    /**
     * a setter for size
     * @param size the new size of the item
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * a setter for color
     * @param color the new color for the item
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * a setter for material
     * @param material the new material for the item
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
