/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author musta
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> inventory = new ArrayList();                             //create an array list to add products to the inventory
        double total = 0.0;                                                         //feilds for total cost
        int end = 0;
        boolean aMember = false;

        Product book1 = new Book("Great Expectations", 7.99, 0, "Charles Dickens");         //creating and adding products to the lis
        Product book2 = new Book("The Stranger", 6.99, 1, "Albert Camus");
        Product cd1 = new CD("Classical Music", 3.99, 2, "Mosart");
        Product cd2 = new CD("Rap Music", 4.99, 3, "Eminem");
        Product dvd1 = new DVD("The Lord Of The Rings", 17.99, 4, "Peter Jackson");
        Product dvd2 = new DVD("Inception", 19.99, 5, "Christopher Nolan");
        inventory.add(book1);
        inventory.add(book2);
        inventory.add(cd1);
        inventory.add(cd2);
        inventory.add(dvd1);
        inventory.add(dvd2);

        ArrayList<Product> shoppingCart = new ArrayList();                              //creating a shopping cart

        System.out.println("**********WELCOME TO THE BOOKSTORE**********");

        while (end == 0) {                                                              //whule loop to allow the user to do multiple tasks
            System.out.println("\nWhat would you like to do?");                         //promts in the menu
            System.out.println("Press 1 to make a purchase");
            System.out.println("Press 2 to view your cart");
            System.out.println("Press 3 to remove previous item from cart");
            System.out.println("Press 4 to checkout");
            System.out.println("Press 5 to become a member (Regular/Premium)");
            System.out.println("Press 6 to exit");

            Scanner sc = new Scanner(System.in);                                                       //scanner for user input
            int input = sc.nextInt();

            switch (input) {                                                        //switch statement for each case
                case 1: {
                    System.out.println("");
                    System.out.println("Take a look at our inventory");
                    for (Product p : inventory) {                       //enhanced for loop to show products in inventory
                        p.display();
                    }
                    System.out.println("\nTo add a Book, CD or DVD to the cart press the corresponding product ID: ");
                    int purchase = sc.nextInt();
                    total = total + inventory.get(purchase).getProductPrice();              //adding price to total
                    shoppingCart.add(inventory.get(purchase));                              //adding product to cart
                    System.out.println("Item: " + purchase + " added to your cart!");
                    break;
                }
                case 2: {
                    System.out.println("Your cart:");
                    for (Product p : shoppingCart) {
                        System.out.println("Product name: " + p.getProductName() + " | Product price: $" + p.getProductPrice());        //enhanced for loop to show shopping cart with name and price
                    }
                    break;
                }
                case 3: {
                    System.out.println(shoppingCart.get(shoppingCart.size() - 1).getProductName() + " was removed from your cart!");
                    total = total - shoppingCart.get(shoppingCart.size() - 1).getProductPrice();                        //subtract cost from total
                    shoppingCart.remove(shoppingCart.size() - 1);                                                       //remove product from cart
                    break;
                }
                case 4: {
                    System.out.println("\nYour total cost is $" + total);
                    System.out.println("To complete purchase, press 1. To go back press 0");
                    int ifEnd = sc.nextInt();
                    if (ifEnd == 1) {
                        end = 1;
                        System.out.println("Purachse complete. You have been charged $" + total);                   //if statement for checking out the products
                        System.out.println("Thank you for shopping with us!");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Please enter your first name: ");                               //scanners to collect name and last name
                    String firstName = sc.next();
                    System.out.println("Please enter your last name: ");
                    String lastName = sc.next();
                    System.out.println("Would you like to become a premium member for $7/month to avail exclusive benefits?");
                    System.out.println("Enter 1 to be a premium member or 0 to be a regular member");
                    int membership = sc.nextInt();
                    if (membership == 1) {
                        aMember = true;                                                                                     //if statemnt to sign up for membership and ask for premium membership
                        System.out.println("Congratulations, you are a premium member now. You were charged $7");           
                    }
                    Member m1 = new Member(firstName, lastName, 101, aMember);                                              //creating a member object with user input
                    System.out.println("Your member ID is " + m1.getMemberId());
                    System.out.println("Thank you for being a member " + m1.getFirstName() + "!");
                    
                    break;
                }
                case 6: {
                    end = 1;                                                                            //ending while loop
                    System.out.println("Thank you for coming!");
                    break;
                }
            }
        }

    }

}
