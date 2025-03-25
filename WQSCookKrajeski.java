import java.util.ArrayList;
import java.util.Scanner;
public Class WQSCookKrajeski{
    Scanner kb = new java.util.Scanner()
    private List<StoreItem> inventory = new ArrayList<StoreItem>();
    private List<StoreItem> cart = new ArrayList<StoreItem>();
    private List<StoreItem> tempView = new ArrayList<StoreItem>();

    public void addToInventory(StoreItem item){
        boolean check = true;
        for(StoreItem a : inventory){
            if a.getName() == item.getName() {
                a.setQuantity(a.getQuantity()+item.getQuantity());
                check = false;
            }
        }
        if check{
            inventory.add(item);
        }       
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
        StoreItem copy = item;
        copy.setQuantity(copy.getQuantity()-1);
        cart.add(copy);
        this.removeFromInventory(item);
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
                        for(StoreItem item : inventory){
                            if item instanceOf FoodItem{
                                tempView.add(item);
                            }
                        }
                        for(StoreItem item : tempView){
                            System.out.println(item);
                        }
                        System.out.print("Enter the name of the item you would like to sell: ");
                        response = kb.next;
                        for(StoreItem item : tempView){
                            if response == item.getName(){
                                this.addToCart(item);
                            }
                        }
                        break;
                    case "electronics":
                        for(StoreItem item : inventory){
                            if item instanceOf ElectronicsItem{
                                tempView.add(item);
                            }
                        }
                        for(StoreItem item : tempView){
                            System.out.println(item);
                        }
                        System.out.print("Enter the name of the item you would like to sell: ");
                        response = kb.next;
                        for(StoreItem item : tempView){
                            if response == item.getName(){
                                this.addToCart(item);
                            }
                        }
                        break;
                    case "clothing":
                        for(StoreItem item : inventory){
                            if item instanceOf ClothingItem{
                                tempView.add(item);
                            }
                        }
                        for(StoreItem item : tempView){
                            System.out.println(item);
                        }
                        System.out.print("Enter the name of the item you would like to sell: ");
                        response = kb.next;
                        for(StoreItem item : tempView){
                            if response == item.getName(){
                                this.addToCart(item);
                            }
                        }
                        break;
                    case "household":
                        for(StoreItem item : inventory){
                            if item instanceOf HouseholdItem{
                                tempView.add(item);
                            }
                        }
                        for(StoreItem item : tempView){
                            System.out.println(item);
                        }
                        System.out.print("Enter the name of the item you would like to sell: ");
                        response = kb.next;
                        for(StoreItem item : tempView){
                            if response == item.getName(){
                                this.addToCart(item);
                            }
                        }
                        break;
                }
                tempView.clear();
                System.out.print("Done selling? (y/n): ");
                response = kb.next();
                if response == "y"{
                    loop = false;
                }    
            }
            System.out.println("Cart:");
            double total = 0;
            for(StoreItem item : cart){
                System.out.println(item);
                total += item.getPrice() + (item.getPrice()*item.getTax);
            }
            System.out.println("Total:  $", total);
            System.out.println("Process checkout? (y/n)");
            response = kb.next();
            if response == "y"{
                System.out.println("Checkout complete");
            }
            else{
                
            
        }
        else if response == "add"{
            loop = true;
            while loop{
                System.out.print("What kind of item would you like to add? (food/electronics/clothing/household): ");
                response = kb.next;
                switch response {
                    case "food":
                        for(StoreItem item : inventory){
                            if item instanceOf FoodItem{
                                tempView.add(item);
                            }
                        }
                        for(StoreItem item : tempView){
                            System.out.println(item);
                        }
                        System.out.print("Enter 1 to increase quantity of an item, 2 to add a new item: ");
                        response = kb.nextInt();
                        switch response{
                            case 1:
                                System.out.println("Enter the name of the item you would like to add to: ");
                                response = kb.next();
                                
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
