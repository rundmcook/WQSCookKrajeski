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
                for(StoreItem item : cart){
                    this.addToInventory(item);
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
                                for(StoreItem a : tempView){
                                    if a.getName() == response{
                                        System.out.print("Enter new quantity for this item: ");
                                        a.setQuantity(kb.next());
                                        break;
                                    }
                                }
                                System.out.println("This item is not present in the inventory");
                                break;
                            case 2:
                                System.out.print("Adding a new item, enter the number of the type of item (1-3) that you would like to add: ");
                                System.out.println("1 - Fruit \n2 - Vegetable \n3 - ShelfStable");
                                response = kb.nextInt();
                                switch response{
                                    case 1: 
                                        System.out.print("Adding a Fruit, enter the name of the fruit: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the fruit: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the fruit: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the fruit: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter calories: ");
                                        int calories = kb.nextInt();
                                        System.out.print("Enter expiration date: ");
                                        String expiration = kb.next();
                                        System.out.print("Enter weight: ");
                                        double weight = kb.nextDouble();
                                        Fruit newFruit = new Fruit(name, serial, price, brand, quantity, calories, expiration, weight);
                                        this.addToInventory(newFruit);
                                        System.out.print("Object added: ", newFruit.getName());
                                        break;
                                    case 2:
                                        System.out.print("Adding a Vegetable, enter the name of the vegetable: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the vegetable: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the vegetable: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the vegetable: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter calories: ");
                                        int calories = kb.nextInt();
                                        System.out.print("Enter expiration date: ");
                                        String expiration = kb.next();
                                        System.out.print("Enter weight: ");
                                        double weight = kb.nextDouble();
                                        Vegetable newVeg = new Vegetable(name, serial, price, brand, quantity, calories, expiration, weight);
                                        this.addToInventory(newVeg);
                                        System.out.print("Object added: ", newVeg.getName());
                                        break;
                                    case 3:
                                        System.out.print("Adding a ShelfStable food, enter the name: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the food: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the food: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the food: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter calories: ");
                                        int calories = kb.nextInt();
                                        System.out.print("Enter expiration date: ");
                                        String expiration = kb.next();
                                        System.out.print("Enter packaging type: ");
                                        String packaging = kb.next();
                                        ShelfStable newSS = new ShelfStable(name, serial, price, brand, quantity, calories, expiration, packaging);
                                        this.addToInventory(newSS);
                                        System.out.print("Object added: ", newSS.getName());
                                        break;
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
                        System.out.print("Enter 1 to increase quantity of an item, 2 to add a new item: ");
                        response = kb.nextInt();
                        switch response{
                            case 1:
                                System.out.println("Enter the name of the item you would like to add to: ");
                                response = kb.next();
                                for(StoreItem a : tempView){
                                    if a.getName() == response{
                                        System.out.print("Enter new quantity for this item: ");
                                        a.setQuantity(kb.next());
                                        break;
                                    }
                                }
                                System.out.println("This item is not present in the inventory");
                                break;
                            case 2:
                                System.out.print("Adding a new item, enter the number of the type of item (1-3) that you would like to add: ");
                                System.out.println("1 - Laptop \n2 - Phone \n3 - TV");
                                response = kb.nextInt();
                                switch response{
                                    case 1: 
                                        System.out.print("Adding a Laptop, enter the name: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the Laptop: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the Laptop: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the Laptop: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter model: ");
                                        String model = kb.next();
                                        System.out.print("Enter year: ");
                                        int year = kb.nextInt();
                                        System.out.print("Enter screen size: ");
                                        int screenSize = kb.nextInt();
                                        Laptop newLaptop = new Laptop(name, serial, price, brand, quantity, model, year, screenSize);
                                        this.addToInventory(newLaptop);
                                        System.out.print("Object added: ", newLaptop.getName());
                                        break;
                                    case 2:
                                        System.out.print("Adding a Phone, enter the name of the phone: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the phone: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the phone: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the phone: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter model: ");
                                        String model = kb.next();
                                        System.out.print("Enter year: ");
                                        int year = kb.nextInt();
                                        System.out.print("Enter cameraQuality: ");
                                        double camera = kb.nextDouble();
                                        Phone newPhone = new Phone(name, serial, price, brand, quantity, model, year, camera);
                                        this.addToInventory(newPhone);
                                        System.out.print("Object added: ", newPhone.getName());
                                        break;
                                    case 3:
                                        System.out.print("Adding a TV, enter the name: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the TV: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the TV: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the TV: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter model: ");
                                        String model = kb.next();
                                        System.out.print("Enter year: ");
                                        int year = kb.nextInt();
                                        System.out.print("Enter screenSize: ");
                                        int screenSize = kb.nextInt();
                                        TV newTV = new TV(name, serial, price, brand, quantity, model, year, screenSize);
                                        this.addToInventory(newTV);
                                        System.out.print("Object added: ", newTV.getName());
                                        break;
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
                        System.out.print("Enter 1 to increase quantity of an item, 2 to add a new item: ");
                        response = kb.nextInt();
                        switch response{
                            case 1:
                                System.out.println("Enter the name of the item you would like to add to: ");
                                response = kb.next();
                                for(StoreItem a : tempView){
                                    if a.getName() == response{
                                        System.out.print("Enter new quantity for this item: ");
                                        a.setQuantity(kb.next());
                                        break;
                                    }
                                }
                                System.out.println("This item is not present in the inventory");
                                break;
                            case 2:
                                System.out.print("Adding a new item, enter the number of the type of item (1-3) that you would like to add: ");
                                System.out.println("1 - Shirt \n2 - Shoe \n3 - Outerwear");
                                response = kb.nextInt();
                                switch response{
                                    case 1: 
                                        System.out.print("Adding a Shirt, enter the name of the Shirt: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the shirt: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the shirt: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the shirt: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter size: ");
                                        String size = kb.next();
                                        System.out.print("Enter color: ");
                                        String color = kb.next();
                                        System.out.print("Enter material: ");
                                        String material = kb.next();
                                        System.out.print("Enter sleeve type: ");
                                        String sleeve = kb.next()
                                        Shirt newShirt = new Shirt(name, serial, price, brand, quantity, size, color, material, sleeve);
                                        this.addToInventory(newShirt);
                                        System.out.print("Object added: ", newShirt.getName());
                                        break;
                                    case 2:
                                        System.out.print("Adding a Shoe, enter the name of the shoe: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the shoe: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the shoe: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the shoe: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter size: ");
                                        String size = kb.next();
                                        System.out.print("Enter color: ");
                                        String color = kb.next();
                                        System.out.print("Enter material: ");
                                        String material = kb.next();
                                        System.out.print("Enter purpose: ");
                                        String purpose = kb.next();
                                        Shoe newShoe = new Shoe(name, serial, price, brand, quantity, size, color, material, purpose);
                                        this.addToInventory(newShoe);
                                        System.out.print("Object added: ", newShoe.getName());
                                        break;
                                    case 3:
                                        System.out.print("Adding an Outerwear, enter the name: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the outerwear: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the outerwear: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the outerwear: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter size: ");
                                        String size = kb.next();
                                        System.out.print("Enter color: ");
                                        String color = kb.next();
                                        System.out.print("Enter material: ");
                                        String material = kb.next();
                                        System.out.print("Enter temp rating: ");
                                        int tempRating = kb.nextInt();
                                        Outerwear newOW = new Outerwear(name, serial, price, brand, quantity, size, color, material, tempRating);
                                        this.addToInventory(newOW);
                                        System.out.print("Object added: ", newOW.getName());
                                        break;
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
                        System.out.print("Enter 1 to increase quantity of an item, 2 to add a new item: ");
                        response = kb.nextInt();
                        switch response{
                            case 1:
                                System.out.println("Enter the name of the item you would like to add to: ");
                                response = kb.next();
                                for(StoreItem a : tempView){
                                    if a.getName() == response{
                                        System.out.print("Enter new quantity for this item: ");
                                        a.setQuantity(kb.next());
                                        break;
                                    }
                                }
                                System.out.println("This item is not present in the inventory");
                                break;
                            case 2:
                                System.out.print("Adding a new item, enter the number of the type of item (1-3) that you would like to add: ");
                                System.out.println("1 - Furniture \n2 - Cleaning Supply");
                                response = kb.nextInt();
                                switch response{
                                    case 1: 
                                        System.out.print("Adding Furniture, enter the name of the furniture: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the furniture: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the furniture: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the furniture: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter room of use: ");
                                        String roomOfUse = kb.next();
                                        System.out.print("Enter construction material: ");
                                        String constructionMaterial = kb.next();
                                        Furniture newFurniture = new Furniture(name, serial, price, brand, quantity, roomOfUse, constructionMaterial);
                                        this.addToInventory(newFurniture);
                                        System.out.print("Object added: ", newFurniture.getName());
                                        break;
                                    case 2:
                                        System.out.print("Adding a Cleaning product, enter the name of the product: ");
                                        String name = kb.next();
                                        System.out.print("Enter the Serial number of the product: ");
                                        int serial = kb.nextInt();
                                        System.out.print("Enter the price of the product: ");
                                        double price = kb.nextDouble();
                                        System.out.print("Enter the brand of the product: ");
                                        String brand = kb.next();
                                        System.out.print("Enter the quantity: ");
                                        int quantity = kb.nextInt();
                                        System.out.print("Enter room of use: ");
                                        String roomOfUse = kb.next();
                                        System.out.print("Enter what it is used to clean: ");
                                        String usedToClean = kb.next();
                                        CleaningSupply newCS = new CleaningSupply(name, serial, price, brand, quantity, roomOfUse, usedToClean);
                                        this.addToInventory(newCS);
                                        System.out.print("Object added: ", newCS.getName());
                                        break;
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
