import java.util.Scanner;

public class StockCommission {
	private static String StockName = null;
	private static int NUMBER_OF_SHARES;// = 600;
	private static final double STOCK_PRICE = 201.77;
	private static final double COMMISSION_PERCENT = 0.02;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Stock name:");
		StockName = scan.next();

		System.out.print("Enter the number of shares you want to buy :");
		NUMBER_OF_SHARES = scan.nextInt();

		// Calculate the stock cost.
		double stockCost = calculateStockCost(STOCK_PRICE, NUMBER_OF_SHARES);

		// Calaculate the commission.
		double commission = calculateCommission(stockCost, COMMISSION_PERCENT);

		// Calculate the total.
		double total = stockCost + commission;

		// Display the results.
		System.out.println("Stock name: $" + StockName);
		System.out.println("Stock cost: $" + stockCost);
		System.out.println("Commission: $" + commission);
		System.out.println("Total:      $" + total);
	}

	public static double calculateStockCost(double stockPrice, double commission) {
		return stockPrice * commission;
	}

	public static double calculateCommission(double stockCost, double commissionPercent) {
		return stockCost * commissionPercent;
	}
}
