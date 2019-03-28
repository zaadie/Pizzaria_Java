/* Author: Saadiya Fourie
 * Week 3 Exercise Solution
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class PizzaOrderSolution03 {
	// Costs of pizza bases and toppings.
		 public static final double SMALL_BASE_PRICE = 8.0;
		 public static final double LARGE_BASE_PRICE = 11.0;
		 public static final double FAMILY_BASE_PRICE = 14.0;
		 public static final double SMALL_TOPPING_PRICE = 1.0;
		 public static final double LARGE_TOPPING_PRICE = 1.5;
		 public static final double FAMILY_TOPPING_PRICE = 2.0;
	public static void main(String[] args) throws FileNotFoundException {
		
		// Helper objects.
		FileInputStream pizzaOrders = new FileInputStream("pizzaorders");
		Scanner sc = new Scanner(pizzaOrders);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		Random r = new Random();
		
		
		// Variables for pizza order types in the order.
		String baseSize = "";
		
		int numToppings = 0;
		int quantity = 0;
		
		double baseCost = 0;
		double toppingCost = 0;
		double pizzaCost = 0;
		
		// Variables for the whole order, 
		double totalCost = 0;
		
		// Welcome message.
		System.out.println("We are now processinf your pizza order.");
		System.out.println();
		
		for (int line = 1; line <= 3; line++) {
			
			// Get pizza details.
			numToppings = r.nextInt(7);
			quantity = sc.nextInt();
			
			
			// Calculate piza cost.
			switch (line) {
			case 1:
				System.out.println("Processing small pizzas.");
				System.out.println("Num toppings: " + numToppings);
				System.out.println("Quantity: " + quantity);
				baseCost = SMALL_BASE_PRICE;
				toppingCost = SMALL_TOPPING_PRICE;
				break;
			case 2:
				System.out.println("Processing large pizzas.");
				System.out.println("Num toppings: " + numToppings);
				System.out.println("Quantity: " + quantity);
				baseCost = LARGE_BASE_PRICE;
				toppingCost = LARGE_TOPPING_PRICE;
				break;
			case 3:
				System.out.println("Processing family pizzas.");
				System.out.println("Num toppings: " + numToppings);
				System.out.println("Quantity: " + quantity);
				baseCost = FAMILY_BASE_PRICE;
				toppingCost = FAMILY_TOPPING_PRICE;
				break;
			}
			pizzaCost = (baseCost + (numToppings * toppingCost)) * quantity;
			
			System.out.print("Pizza cost is: ");
			System.out.println(nf.format(pizzaCost));
			
			// Maintain totalCost
			totalCost += pizzaCost;
			
			// Add line break between different pizza sizes.
			System.out.println();
		}
		
		// Display total cost.
		System.out.print("Total Cost: ");
		System.out.println(nf.format(totalCost));
		System.out.println("Thank you for you order.");
	}
	
}
