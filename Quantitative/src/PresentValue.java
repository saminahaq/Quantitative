import java.util.Scanner;

public class PresentValue {

	public static void main(String[] args) {

		// Scanner object to get input
		Scanner keyboard = new Scanner(System.in);

		// Desired future value
		System.out.print("Future value? ");
		double futureValue = keyboard.nextDouble();

		// Annual interest rate.
		System.out.print("Annual interest rate? ");
		double annualInterestRate = keyboard.nextDouble();

		// Number of years investment to draw interest
		System.out.print("Number of years? ");
		int numberOfYears = keyboard.nextInt();

		// close scanner
		keyboard.close();

		double present = calculatePresentValue(futureValue, annualInterestRate, numberOfYears);

		// Display the result to user
		System.out.println("You need to invest $" + present);
	}

	public static double calculatePresentValue(double futureValue, double annualInterestRate, int numberOfYears) {

		return futureValue / Math.pow((1 + annualInterestRate), numberOfYears);
	}
}
