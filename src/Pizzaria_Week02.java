
/*TO DO : 
 * Format prices
 */

// Begin PizzaOrder.java

import java.util.Scanner;


/* Author: Zaadie Fourie
 * 
 * Description: Represents a pizza order (bases and toppings) and the costs.
 * Use of the Scanner class to take in customer input and assign
 * values to variables in order to construct a full Pizzeria Order.
 */

public class Pizzaria_Week02 {
	
	// Costs of pizza and toppings
	public static final double SMALL_BASE_PRICE = 8.0;
	public static final double LARGE_BASE_PRICE = 11.0;
	public static final double FAMILY_BASE_PRICE = 14.0;
	public static final double SMALL_TOPPING_PRICE = 1.0;
	public static final double LARGE_TOPPING_PRICE = 1.5; 
	public static final double FAMILY_TOPPING_PRICE = 2.0;
	
	
	// Calculates the cost of a fixed pizza order
	public static void main(String[] args) {
		
		// Initialize scanner to read order input
		Scanner sc = new Scanner(System.in);
		
		// Declare and assign user variables
		char size;
		char orderMore = 'y';

		double sPizzaPrice = 0;
		double lPizzaPrice = 0;
		double fPizzaPrice = 0;
		
		double tSum = 0;
		double order = 0;

		int toppings = 0;
		int amount = 0;

		System.out.println("Please place the order for your pizza.");
		
		
		while (orderMore == 'y') {
			// Prompt user for pizza size
			System.out.println("Size (s = small, l = large, f = family).");
			
			// Initialise pizza size.
			size = sc.next().charAt(0);
			
			// Determine price accordingly to size and assign value to order.
			
			// Small Pizza Maker
			if (size == 's') {
				sPizzaPrice += SMALL_BASE_PRICE;
				// Prompt user for number of toppings
				System.out.println("Number of toppings: ");
				
				// Assign number to toppings
				toppings = sc.nextInt();
				
				// Calculate topping price
				tSum = toppings * SMALL_TOPPING_PRICE ;
				
				// Add topping price to order
				sPizzaPrice += tSum;
				
				// Prompt user for amount of pizza type
				// hasNextInt to prevent Mismatch Error
				System.out.println("Quantity: ");
				amount = sc.nextInt();
				sPizzaPrice *= amount;
				
				// Update order price
				order += sPizzaPrice;
				// Display pizza cost
				System.out.println("Pizza cost is: $" + sPizzaPrice);

			} 
			// Large Pizza Maker
			else if (size == 'l') {
				lPizzaPrice += LARGE_BASE_PRICE;
				// Prompt user for number of toppings
				System.out.println("Number of toppings: ");
				
				// Assign number to toppings
				toppings = sc.nextInt();
				
				// Calculate topping price
				tSum = toppings * LARGE_TOPPING_PRICE ;
				
				// Add topping price to order
				lPizzaPrice += tSum;
				
				// Prompt user for amount of pizza type
				// hasNextInt to prevent Mismatch Error
				System.out.println("Quantity: ");
				amount = sc.nextInt();
				lPizzaPrice *= amount;
				
				// Update order price
				order += lPizzaPrice;
				
				// Display pizza cost
				System.out.println("Pizza cost is: $" + lPizzaPrice);
			} 
			// Family Pizza Maker
			else if (size == 'f') {
				fPizzaPrice += FAMILY_BASE_PRICE;
				// Prompt user for number of toppings
				System.out.println("Number of toppings: ");
				
				// Assign number to toppings
				toppings = sc.nextInt();
				
				// Calculate topping price
				tSum = toppings * FAMILY_TOPPING_PRICE ;
				
				// Add topping price to order
				fPizzaPrice += tSum;
				
				// Prompt user for amount of pizza type
				// hasNextInt to prevent Mismatch Error
				System.out.println("Quantity: ");
				amount = sc.nextInt();
				fPizzaPrice *= amount;
				
				// Update order price
				order += fPizzaPrice;
				
				// Display pizza cost
				System.out.println("Pizza cost is: $" + fPizzaPrice);
			} 
			// If an incorrect char value is entered notify user.
			else {
				System.out.println("You did not enter a pizza size");
			}
						
			System.out.println("Order more? (y/n): ");
			orderMore = sc.next().charAt(0);
		}
	
			// Print pizza(s) cost
			System.out.println("Total cost is: $" + order);
			
			System.out.println("Thank you for your order!");
			
			sc.close();

	}

}
