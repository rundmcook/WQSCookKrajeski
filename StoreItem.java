/**
 * StoreItem.java
 * This is a superclass for the box store project.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a general item class for the store
 */
public class StoreItem {
    //Attributes
    private String name;
    private int serial;
    private double price;
    private String brand;
    private int quantity;
    private String returnPolicy = "Return the item within 30 days for a refund";
    //default tax rate on all non food items
    private double tax = .07

    //constructor
    /**
     * a constructor for the store item class
     * @param name the name of the item
     * @param serial the serial number for the item
     * @param price the price of an item
     * @param brand the brand of the item
     * @param quantity the amount of an item
     */
    public StoreItem(String name, int serial, double price, String brand, int quantity) {
        this.name = name;
        this.serial = serial;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
    }

    //getters-accessors
    /**
     * a getter for name
     * @return a string with the name
     */
    public String getName() {
        return name;
    }

    /**
     * a getter for serial
     * @return an int of the serial number
     */
    public int getSerial() {
        return serial;
    }

    /**
     * a getter for price
     * @return a double with the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * a getter for brand
     * @return a string with the brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * a getter for quantity
     * @return an int of the amount of the item
     */
    public int getQuantity() {
        return quantity;
    }

     /**
     * accessor for tax rate
     */
    public double getTax() {
        return tax;
    }

    /**
     * accessor for return policy
     */
    public String getReturnPolicy() {
        return returnPolicy;
    }

    //setters-mutators
    /**
     * a setter for name
     * @param name the desired name change
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * a setter for serial
     * @param serial the desired serial change
     */
    public void setSerial(int serial) {
        this.serial = serial;
    }

    /**
     * a setter for price
     * @param price the desired new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * a setter for brand
     * @param brand the desired brand change
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * a setter for quantity
     * @param quantity the new desired quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * an override to the toString object method
     * @return a formatted string
     */
    @Override
    public String toString() {
        return String.format("%-15s %10i %10d %10s %10i", getName(), getSerial(), getPrice(), getBrand(), getQuantity());
    }
}
