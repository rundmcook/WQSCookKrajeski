/**
 * Furniture.java
 * This is a subclass of the HouseholdItem class, specifically for furniture
 *
 * @author Jonathon Krajeski, Dillon Cook
 * Date: March 30, 2025
 * Section: CSC-331-001
 *
 * Purpose: To have a Furniture specific class for the store
 */
public class Furniture extends HouseholdItem{
    //Attributes
    private constructionMaterial;

    //constructor

    /**
     * Constructor for the Furniture object
     * @param name name of the item
     * @param serial serial number for the item
     * @param price price of the item
     * @param brand brand of the item
     * @param model or version of the item
     * @param year release date of item
     * @param constructionMaterial material used to make this furniture
     */
    public Furniture(String name, int serial, double price, String brand, int quantity, String roomOfUse, String constructionMaterial){
        super(name, serial, price, brand, quantity, roomOfUse);
        this.constructionMaterial = constructionMaterial;
    }

    //accessors

    /**
     * accessor for the constructionMaterial of the object
     * @return constructionMaterial of the object
     */
    public String getConstructionMaterial(){
        return constructionMaterial;
    }

    //mutators

    /**
     * Sets a new constructionMaterial for the object
     * @param constructionMaterial new constructionMaterial of the object
     */
    public void setConstructionMaterial(String constructionMaterial){
        this.constructionMaterial = constructionMaterial;
    }
}