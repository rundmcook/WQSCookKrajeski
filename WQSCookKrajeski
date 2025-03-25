import java.util.ArrayList;
import java.util.Scanner;
public Class WQSCookKrajeski{
    Scanner kb = new java.util.Scanner()
    private List<StoreItem> inventory = new ArrayList<StoreItem>();
    private List<StoreItem> cart = new ArrayList<StoreItem>();

    public void addToInventory(StoreItem item){
        inventory.add(item);
    }
    public void displayInventory(){
        System.out.printf("%-15s %10s %10s %10s %10s", "Name", "Serial", "Price", "Brand", "Quantity");
        for(StoreItem item : inventory){
            System.out.println(item);
        }
    }
    public void removeFromInventory(StoreItem item){
        if item.getQuantity() > 1{
            item.setQuantity(item.getQuantity()-1);
        }
        else{
            inventory.remove(item);
        }
    }
    public void addToCart(StoreItem item){
        cart.add(item);
    }
    public void removeFromCart(StoreItem item){
        if item.getQuantity() > 1{
            item.setQuantity(item.getQuantity()-1);
        }
        else{
            cart.remove(item);
        }
    }
    public void viewCart(){
        System.out.printf("%-15s %10s %10s %10s %10s", "Name", "Serial", "Price", "Brand", "Quantity");
        for(StoreItem item : cart){
            System.out.println(item);
        }
    }
    public void checkout(){

    }

    public static void main(String[] args){
        System.out.print("Would you like to sell an item or add an item to inventory? (sell/add): ");
        String response = kb.next();
        if response == "sell"{
            loop = true;
            while loop {
                System.out.print("What kind of item would you like to sell? (food/electronics/clothing/household): ");
                response = kb.next();
                switch response {
                    case "food":
                        break;
                    case "electronics":
                        break;
                    case "clothing":
                        break;
                    case "household":
                        break;
                }
                System.out.print("Done selling? (y/n): ");
                response = kb.next();
                if response == "y"{
                    loop = false;
                }
            }
        }
        else if response == "add"{
            loop = true;
            while loop{
                System.out.print("What kind of item would you like to add? (food/electronics/clothing/household): ");
                response = kb.next;
                switch response {
                    case "food":
                        break;
                    case "electronics":
                        break;
                    case "clothing":
                        break;
                    case "household":
                        break;
                }
                System.out.print("Done adding? (y/n): ");
                response = kb.next();
                if response == "y" {
                loop = false;
                }
            }
        }
    }
}
