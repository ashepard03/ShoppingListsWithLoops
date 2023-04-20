package org.yearup.shopping;

import java.util.Scanner;

public class ShoppingListsWithLoopsApp {
    public static void main(String[] args) {

        //Show the user a ist of items for sale
        //Only show the product names and ID's, not the prices
        Item[] itemsForSale = ItemsForSale.itemsForSale;
        for (Item i : itemsForSale){
            if ( ! i.isInStock()) continue;
            System.out.println(i.getDescription() + " " +  i.getProductID());
        }

        System.out.println("Welcome to Java10 Shopping Center");
        //Invite the user to buy something
        //Read the users response
        System.out.println("Please provide the Product ID of the item you would like to select");
        Scanner userInput = new Scanner(System.in);
        String selectedProductId = userInput.nextLine().trim();
        System.out.println("You have selected item " + selectedProductId);

        Item selectedItem = null;

        for (Item i : itemsForSale){
            if (selectedProductId.equals(i.getProductID())){
                selectedItem = i;
                System.out.println("You will have to purchase " + i.getDescription() + ". " + "This items costs $" + i.getPrice());
                break;
            }
        }
        //Read user response
        System.out.println("Are you okay with this price? (Yes/No)");
        String userResponse = userInput.nextLine();
        //if yes, tell them it's theirs
        if (userResponse.equalsIgnoreCase("yes")){
            System.out.println("Great, I will add this item to your cart!");
        //if no, start over and show them the list again
        } else if (userResponse.equalsIgnoreCase("no")){
            System.out.println("Sorry to hear that! Please check out the store's other items.");
            for (Item i : itemsForSale){
                if ( ! i.isInStock()) continue;
                System.out.println(i.getDescription() + " " +  i.getProductID());
            }
        }
    }
}
