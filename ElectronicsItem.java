/**
 * ElectronicsItem.java
 * This is a superclass for the box store project, specifically for electronics.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a general electronics item class for the store
 */
public class ElectronicsItem extends StoreItem{
    //Attributes
    private String model;
    private String year;

    //constructor
    /**
     * a constructor for the ElectronicsItem class
     * @param name name of the item
     * @param serial serial number for the item
     * @param price price of the item
     * @param brand brand of the item
     * @param model or version of the item
     * @param year release date of item
     */
    public ElectronicsItem(String name, int serial, double price, String brand, int quantity, String model, String year) {
        super(name, serial, price, brand, quantity);
        this.model = model;
        this.year = year;
    }

    //getters-accessors
    /**
     * a getter for model
     * @return the model of the product
     */
    public String getModel() {
        return model;
    }

    /**
     * a getter for year
     * @return year of creation
     */
    public int getYear() {
        return year;
    }

    //setters-mutators
    /**
     * a setter for model
     * @param model or version of item
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * a setter for model year
     * @param year the new year of creation
     */
    public void setYear(int year) {
        this.year = year;
    }

}
