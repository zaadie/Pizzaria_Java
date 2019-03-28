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
			 System.out.print("Size (s = small, l = large, f = family):");
			 baseSize = sc.nextLine();
			 return baseSize;
		 }
		 
		 public int setNumToppings() {
			 System.out.print("Number of toppings: ");
			 numToppings = sc.nextInt();
			 return numToppings;
		 }
		 public int setQuantity() {
			 System.out.print("Quantity: ");
			 quantity = sc.nextInt();
			 return quantity;
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
			switch (baseSize) {
			case "s":
				baseCost = SMALL_BASE_PRICE;
				toppingCost = SMALL_TOPPING_PRICE;
				break;
			 default:
				baseCost = LARGE_BASE_PRICE;
				toppingCost = LARGE_TOPPING_PRICE;
				break;
			case"f":
				baseCost = FAMILY_BASE_PRICE;
				toppingCost = FAMILY_TOPPING_PRICE;
			}
			pizzaCost = ((baseCost + (numToppings * toppingCost)) * quantity);
			return pizzaCost;
		}	
		
		public void orderAgain() {
			String orderAgain;
			Scanner sc = new Scanner(System.in);
			setOrderTotal();

			System.out.print("Order more? (y/n):");
			System.out.println();

			
			orderAgain = sc.nextLine();
			if (orderAgain.equals("y")) {
				pizzaOrder();
			} else {
				System.out.println();
				System.out.println();
				System.out.println("Total cost is " + nf.format(orderTotal));
				System.out.println("Thank you for your order!");
			}
		}
		public void pizzaOrder() {
			System.out.println("Please place the order for your pizza");
			setbaseSize();
			setNumToppings();
			setQuantity();
			calculateCost();
			System.out.print("Pizza (baseSize = " + getBaseSize() + ", numToppings = "
					+ getNumToppings() + ", quantity = " + getQuantity()+ ") "+ " costs ");
			System.out.println(nf.format(pizzaCost));
		
			orderAgain();
			
		}
}
