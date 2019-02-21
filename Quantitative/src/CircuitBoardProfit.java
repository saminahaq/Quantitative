import java.util.Scanner;

/*
 * An electronics company sells circuit boards at a 40 percent profit, 
 * If you know the retail price of a circuit board, 
 * you can calculate its profit with the following formula:
	Profit = Retail price x 0.4
 */
public class CircuitBoardProfit {
	// profit as a percentage constant
	final static double PROFIT_AS_PERCENT = 0.4;

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of years.
		System.out.print("Enter the circuit board's retail price: ");
		double retailPrice = keyboard.nextDouble();

		// Call method to calculate profit.
		double profit = calculateProfit(retailPrice);

		// Display the amount of profit.
		System.out.println("Amount of profit: $" + profit);

		// close keyboard
		keyboard.close();
	}

	public static double calculateProfit(double retailPrice) {
		return retailPrice * PROFIT_AS_PERCENT;
	}

}
