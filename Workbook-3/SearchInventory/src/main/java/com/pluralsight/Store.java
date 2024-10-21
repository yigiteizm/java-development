package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(1,"GroundBeef",8.99);
        inventory.add(2,"Provolone",5.99);
        inventory.add(3,"Steak",15.99);
        inventory.add(4,"Salmon",14.85);
        inventory.add(5,"Butter",7.90);
        System.out.println(inventory);
        return inventory;
    }
}













}
