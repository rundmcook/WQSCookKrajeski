/**
 * ShelfStable.java
 * This is a subclass for the box store project, specifically for the food item ShelfStable.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a specific ShelfStable class
 */
public class ShelfStable extends FoodItem{

    //Attributes
    private String packaging;

    //constructor
    /**
     * a constructor for the FoodItem class
     *
     * @param name       name of the item
     * @param serial     serial number for the item
     * @param price      price of the item
     * @param brand      brand of the item
     * @param calories   the amount of calories in an item
     * @param expiration the expiration date of an item
     * @param packaging  the type of packaging for the item
     */
    public ShelfStable(String name, int serial, double price, String brand, int quantity, int calories, String expiration, String packaging) {
        super(name, serial, price, brand, quantity, calories, expiration);
        this.packaging = packaging;
    }

    //Accessor
    /**
     * a getter for packaging
     * @return a string with the type of packaging
     */
    public String getPackaging() {
        return packaging;
    }

    //Mutator
    /**
     * a setter for packaging
     * @param packaging a new type for packaging
     */
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

}
