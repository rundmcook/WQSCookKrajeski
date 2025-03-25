/**
 * Laptop.java
 * This is a subclass of the ElectronicsItem class, specifically for laptops
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a Laptop specific class for the store
 */
public class Laptop extends ElectronicsItem {
    //Attributes
    private int screenSize;

    //constructor

    /**
     * Constructor for the laptop class
     * @param name name of the item
     * @param serial serial number for the item
     * @param price price of the item
     * @param brand brand of the item
     * @param model or version of the item
     * @param year release date of item
     * @param screenSize size of the screen in pixels
     */
    public Laptop(String name, int serial, double price, String brand, int quantity, String model, int year, int screenSize) {
        super(name, serial, price, brand, quantity, model, year);
        this.screenSize = screenSize;
    }

    //accessors

    /**
     * Accessor for screenSize
     * @return screenSize in pixels
     */
    public int getScreenSize() {
        return screenSize;
    }
    //mutators

    /**
     * Sets a new screenSize
     * @param screenSize new size of the screen
     */
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}