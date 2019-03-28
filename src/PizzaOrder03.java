// Begin PizzaOrder.java
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PizzaOrder03 {
	// Costs of pizza bases and toppings.
	 public static final double SMALL_BASE_PRICE = 8.0;
	 public static final double LARGE_BASE_PRICE = 11.0;
	 public static final double FAMILY_BASE_PRICE = 14.0;
	 public static final double SMALL_TOPPING_PRICE = 1.0;
	 public static final double LARGE_TOPPING_PRICE = 1.5;
	 public static final double FAMILY_TOPPING_PRICE = 2.0;

	public static void main(String[] args) throws FileNotFoundException {
		
		// Initialize file object in program. 
		 File pizzaOrders = new File("pizzaorders");
		 
		 // File handler. 
		 if (pizzaOrders.isFile() == false) {
			 
			 // Error message
			 System.out.println("Error: file not found");
			 
			 // Exit program.
			 System.exit(0);
		 }
		 
		 // Helper objects.
		 Scanner sc = new Scanner(pizzaOrders);
		 Random r = new Random();
		 NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		 
		// Initialize and declare variables			 
		 String baseSize = "";
		 
		 double toppingPrice = 0;
		 double baseCost = 0;
		 double totalCost = 0;
		
		 String[] pizzaSizes = {"small", "large", "family"};
		 
		 Double[] basePrices = {SMALL_BASE_PRICE, LARGE_BASE_PRICE, FAMILY_BASE_PRICE};
		 Double[] toppingPrices = {SMALL_TOPPING_PRICE, LARGE_TOPPING_PRICE, FAMILY_TOPPING_PRICE};
		 
		 int count = 0;
		 
		 System.out.println("We are now processing your order");
		 System.out.println();
		 
		 while(sc.hasNextLine()) {
			 String q = sc.nextLine();
			 int numToppings = (r.nextInt(6 ) + 1);
			 int qty = Integer.parseInt(q);

			 baseSize = pizzaSizes[count];
			 baseCost = basePrices[count] * qty ;
			 toppingPrice = toppingPrices[count] * numToppings;
			 
			 double pizzaOrdersCost = baseCost + toppingPrice;
			
			 totalCost += pizzaOrdersCost;
			 
			 System.out.printf("Processing %s pizzas. %n", pizzaSizes[count]);
			 System.out.printf("Number of toppings: %d %n", numToppings);
			 System.out.printf("Quantity: %d %n", qty);
			 
			 // Number Format
			 System.out.println("Pizza cost is: " + nf.format(pizzaOrdersCost));
			 System.out.println();
			 count++;
		 } 
		 // Number format
		 System.out.println("Total cost is: " + nf.format(totalCost)); 
		 System.out.println("Thankyou for your order!");
		 sc.close();

	}

}
