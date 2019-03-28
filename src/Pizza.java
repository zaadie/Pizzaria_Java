import java.util.Scanner;
import java.text.NumberFormat;

public class Pizza {
	// Costs of pizza bases and toppings.
		 public static final double SMALL_BASE_PRICE = 8.0;
		 public static final double LARGE_BASE_PRICE = 11.0;
		 public static final double FAMILY_BASE_PRICE = 14.0;
		 public static final double SMALL_TOPPING_PRICE = 1.0;
		 public static final double LARGE_TOPPING_PRICE = 1.5;
		 public static final double FAMILY_TOPPING_PRICE = 2.0;
		 
		private String baseSize;
		private int numToppings;
		private int quantity;
		private double baseCost;
		private double toppingCost;
		private double pizzaCost;
		private double orderTotal;
		
		public static NumberFormat nf = NumberFormat.getCurrencyInstance();
		public static Scanner sc = new Scanner(System.in);
		
		 public Pizza(String baseSize, int numToppings, int quantity) {
			this.baseSize = baseSize;
			this.numToppings = numToppings;
			this.quantity = quantity;
		}
		public Pizza(){
				this.baseSize = " ";
				this.numToppings = 0;
				this.quantity = 0;
		}
		 public String setbaseSize() {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Size (s = small, l = large, f = family):");
			 baseSize = sc.nextLine();
			 return baseSize;
		 }
		 
		 public int setNumToppings() {
			 System.out.println("Number of toppings: ");
			 numToppings = sc.nextInt();
			 return numToppings;
		 }
		 public int setQuantity() {
			 System.out.println("Quantity: ");
			 quantity = sc.nextInt();
			 return quantity;
		 }
		 public double setBaseCost() {
			 switch (baseSize) {
			case "s":
				baseCost = SMALL_BASE_PRICE;
				break;
			case "l":
				baseCost = LARGE_BASE_PRICE;
				break;
			case "f":
				baseCost = FAMILY_BASE_PRICE;
				break;
			}
			 return baseCost;
		 }
		 public double setToppingCost() {
			 switch (baseSize) {
			case "s":
				toppingCost = SMALL_TOPPING_PRICE;
				break;
			case "l":
				toppingCost = LARGE_TOPPING_PRICE;
				break;
			case "f":
				toppingCost = FAMILY_TOPPING_PRICE;
				break;
			}
			 return baseCost;
		 }
		 public double setOrderTotal() {
			 orderTotal += pizzaCost;
			 return orderTotal; 
		 }
		public String getBaseSize() {
			return baseSize;
		}
		public int getNumToppings() {
			return numToppings;
		}
		public int getQuantity() {
			return quantity;
		}
		public double getBaseCost() {
			return baseCost;
		}
		public double getOrderTotal() {
			return orderTotal;
		}
		
		public double calculateCost() {
			setBaseCost();
			setToppingCost();
			pizzaCost = ((baseCost + (numToppings * toppingCost)) * quantity);
			return pizzaCost;
		}	
		
		public void orderAgain() {
			String orderAgain;
			Scanner sc = new Scanner(System.in);
			setOrderTotal();

			System.out.println("Order more? (y/n):");
			orderAgain = sc.nextLine();
			if (orderAgain.equals("y")) {
				pizzaOrder();
			} else {
				System.out.println("Total cost is " + nf.format(getOrderTotal()));
				System.out.println("Thank you for your order!");
			}
		}
		public void pizzaOrder() {
			setbaseSize();
			setNumToppings();
			setQuantity();
			calculateCost();
			
			System.out.print("baseSize = " + getBaseSize() + ", numToppings = "
					+ getNumToppings() + ", quantity = " + getQuantity() + " costs ");
			System.out.println(nf.format(calculateCost()));
			orderAgain();
		}
}
