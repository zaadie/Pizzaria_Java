import java.util.Scanner;

// Begin PizzaOrder.java
// Represents a pizza order (bases and toppings) and the costs.

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
		
		// Intialise user variables
		char size;
		int order = 0;
		int toppings = 0;
		double tSum = 0;
		int amount = 0;
		char orderMore = 'y';
		
		
		System.out.println("Please place the order for your pizza.");
		
		
		while (orderMore == 'y') {
			// Prompt user for pizza size
			System.out.println("Size (s = small, l = large, f = family).");
			
			// Initialise pizza size.
			size = sc.next().charAt(0);
			
			// Determine price accordingly to size and assign value to order.
			
			// Small Pizza Maker
			if (size == 's') {
				order += SMALL_BASE_PRICE;
				// Prompt user for number of toppings
				System.out.println("Number of toppings: ");
				
				// Assign number to toppings
				toppings = sc.nextInt();
				
				// Calculate topping price
				tSum = toppings * SMALL_TOPPING_PRICE ;
				
				// Add topping price to order
				order += tSum;
				
				// Prompt user for amount of pizza type
				// hasNextInt to prevent Mismatch Error
				System.out.println("Quantity: ");
				amount = sc.nextInt();
				order *= amount;
			} 
			
			else if (size == 'l') {
				order += LARGE_BASE_PRICE;
				// Prompt user for number of toppings
				System.out.println("Number of toppings: ");
				
				// Assign number to toppings
				toppings = sc.nextInt();
				
				// Calculate topping price
				tSum = toppings * LARGE_TOPPING_PRICE ;
				
				// Add topping price to order
				order += tSum;
				
				// Prompt user for amount of pizza type
				// hasNextInt to prevent Mismatch Error
				System.out.println("Quantity: ");
				amount = sc.nextInt();
				order *= amount;
			} 
			// If an incorrect value is entered notify user.
			else {
				System.out.println("You did not enter a pizza size");
			}
			
			// Display the total cost of the order
			// Format prices
			System.out.println("Pizza cost is: $" + order);
		
			// Ask user if they would like to order more
			
			System.out.println("Order more? (y/n): ");
			orderMore = sc.next().charAt(0);

		}
		
		
		
			// Print pizza(s) cost
			System.out.println("Total cost is: $" + order);
		
	
	

		
		
		// Order details. Adjust according to pizza order
		int numSmallPizzas = 2;		
		int numLargePizzas = 2;
		int numFamilyPizzas = 1;
		int numSmallToppings = 3;
		int numLargeToppings = 4;
		int numFamilyToppings = 6;
		
		// Storing costs.
		double smallCost = 0.0;
		double largeCost = 0.0;
		double familyCost = 0.0;
		double totalCost = 0.0;
		
//		// Cost for small pizzas.
//		System.out.print("Order for small pizzas: $");
//		smallCost = ((SMALL_BASE_PRICE + (SMALL_TOPPING_PRICE * numSmallToppings)) * numSmallPizzas);
//		System.out.println(smallCost);
//		totalCost += smallCost;
//		
//		// Cost for large pizzas.
//		System.out.print("Order for large pizzas: $");
//		largeCost = ((LARGE_BASE_PRICE + (LARGE_TOPPING_PRICE * numLargeToppings)) * numLargePizzas);
//		System.out.println(largeCost);
//		totalCost += largeCost;
//		
//		// Cost for family pizzas.
//		System.out.print("Order for family pizzas: $");
//		familyCost = ((FAMILY_BASE_PRICE + (FAMILY_TOPPING_PRICE * numFamilyToppings)) * numFamilyPizzas);
//		System.out.println(familyCost);
//		totalCost += familyCost;
//		
//		// Total of all pizzas.
//		System.out.println("Total cost is: $"+ totalCost);

	}

}
