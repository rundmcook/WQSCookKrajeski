/**
 * Vegetable.java
 * This is a subclass for the box store project, specifically for the food item vegetable.
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a specific vegetable class
 */
public class Vegetable extends FoodItem{
    //attributes
    private double weight;

    //constructor
    /**
     * a constructor for the vegetable class
     * @param name       name of the item
     * @param serial     serial number for the item
     * @param price      price of the item
     * @param brand      brand of the item
     * @param calories   the amount of calories in an item
     * @param expiration the expiration date of an item
     * @param weight     the weight of the item
     */
    public Vegetable(String name, int serial, double price, String brand, int quantity, int calories, String expiration, double weight) {
        super(name, serial, price, brand, quantity, calories, expiration);
        this.weight = weight;
    }

    //Accessor
    /**
     * a getter for weight
     * @return a double with the item weight
     */
    public double getWeight() {
        return weight;
    }

    //Mutator
    /**
     * a setter for weight
     * @param weight the new desired weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
