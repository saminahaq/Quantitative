
public class StockTransaction {
	
	static final int NUM_SHARES = 1000; // Number of shares
	static final double PURCHASE_PRICE = 32.87; // Purchase price per share
	static final double SELLING_PRICE = 33.92; // Selling price per share
	static final double BROKER_COMM_RATE = 0.02; // Broker commission rate

	public static void main(String[] args) {

		double stockPurchase = stockPurchasePrice(NUM_SHARES, PURCHASE_PRICE);

		double purchaseComm = brokersCommission(stockPurchase, BROKER_COMM_RATE);

		double amountPaid = totalAmountPaid(stockPurchase, purchaseComm);

		double stockSale = stockSale(NUM_SHARES, SELLING_PRICE);

		double sellingComm = sellingCommission(NUM_SHARES, SELLING_PRICE, BROKER_COMM_RATE);

		double amountRecieved = totalAmountRecieved(stockSale, sellingComm);

		double profitOrLoss = profitOrLoss(amountRecieved, amountPaid);

		// Display the results.
		System.out.println("You paid $" + stockPurchase + " for the stock.");
		System.out.println("You paid his broker a commission of $" + purchaseComm + " on the purchase.");
		System.out.println("So, You paid a total of $" + amountPaid + "\n");

		System.out.println("You sold the stock for $" + stockSale);
		System.out.println("You paid his broker a commission of $" + sellingComm + " on the sale.");
		System.out.println("So, You recieved a total of $" + amountRecieved + "\n");
		System.out.println("You's profit or loss: $" + profitOrLoss);
	}

	static double stockPurchasePrice(double numberOfShares, double purchasePrice) {
		return numberOfShares * purchasePrice;
	}

	static double brokersCommission(double stockPurchase, double brokersCommissionRate) {
		return stockPurchase * brokersCommissionRate;
	}

	static double totalAmountPaid(double stockPurchase, double purchaseComm) {
		return stockPurchase + purchaseComm;
	}

	static double stockSale(double numberOfShares, double sellingPrice) {
		return numberOfShares * sellingPrice;
	}

	static double sellingCommission(double numberOfShares, double sellingPrice, double brokersCommissionRate) {
		return (numberOfShares * sellingPrice) * brokersCommissionRate;
	}

	static double totalAmountRecieved(double stockSale, double sellingCommission) {
		return stockSale - sellingCommission;
	}

	static double profitOrLoss(double amountRecieved, double amountPaid) {
		return amountRecieved - amountPaid;
	}

}
