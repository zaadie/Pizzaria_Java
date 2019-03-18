// Begin Pizza Order.java
import java.text.NumberFormat;
import java.util.Scanner;

//Represents a pizza order (bases and toppings) and the costs.
public class PIzzeria_Solution_Week02 {
	
	 // Costs of pizza bases and toppings.
	public static final double SMALL_BASE_PRICE = 8.0;
	public static final double LARGE_BASE_PRICE = 11.0;
	public static final double FAMILY_BASE_PRICE = 14.0;
	public static final double SMALL_TOPPING_PRICE = 1.0;
	public static final double LARGE_TOPPING_PRICE = 1.5; 
	public static final double FAMILY_TOPPING_PRICE = 2.0;

	 // Calculates the cost of a user-specified pizza order.
	public static void main(String[] args) {
		// Helper objects.
		 Scanner sc = new Scanner(System.in);
		 NumberFormat nf = NumberFormat.getCurrencyInstance();
		 
		 // Variables for one type of pizza in the order.
		 String baseSize = "";
		 int numToppings = 0;
		 int quantity = 0;
		 double baseCost = 0.0;
		 double toppingCost = 0.0;
		 double pizzaCost = 0.0;
		 
		 // Variables related to the whole order.
		 double totalCost = 0.0;
		 String orderMore = "";
		 
		 // Order pizzas one at a time until finished
		 do {
			 // Get pizza details.
			 System.out.println("Please place the order for your pizza.");
			 System.out.print("Size (s = small, l = large, f = family): ");
			 baseSize = sc.nextLine();
			 System.out.print("Number of toppings: ");
			 numToppings = sc.nextInt();
			 System.out.print("Quantity: ");
			 quantity = sc.nextInt();
			 
			 // Consume buffered input such as the newline.
			 sc.nextLine();
			 
			 // Calculate pizza cost.
			 switch(baseSize) {
			 case "s":
				 baseCost = SMALL_BASE_PRICE;
				 toppingCost = SMALL_TOPPING_PRICE;
				 break;
			 case "f":
				 baseCost = FAMILY_BASE_PRICE;
				 toppingCost = FAMILY_TOPPING_PRICE;
				 break; 
			 default: // Assume "large" is default
				 baseCost = LARGE_BASE_PRICE;
				 toppingCost = LARGE_TOPPING_PRICE;
				 break;
			 }
			 pizzaCost = (baseCost + (numToppings * toppingCost) * quantity);
			 System.out.print("Pizza cost is: ");
			 System.out.println(nf.format(pizzaCost));
			 
			 // Maintain total cost
			 totalCost += pizzaCost;
			 
			 //Determine if order is finished.
			 System.out.println("Order more? (y/n): ");
			 orderMore = sc.nextLine();
			 System.out.println();
			 
		 }while (orderMore.equals("y"));
		 
		 // Display total cost.
		 System.out.print("Total cost is: ");
		 System.out.println(nf.format(totalCost));
		 System.out.println("Thank you for your order!");
		 
		 sc.close();
		 
	}

}
