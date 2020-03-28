import java.util.Scanner;

public class TravelAgency {

	static final int PRICE_FOR_100_KM = 50;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Hello. Please enter your destination in two integers:");
		int coordinate1 = scan.nextInt();
		int coordinate2 = scan.nextInt();

		System.out.println("The price of the flight is:");
		System.out.println(priceOfFlight(calcDistance(coordinate1, coordinate2)));

		long creditCardNumber = getCreditCardNumber();

		creditCardValidationResult(creditCardNumber);
	}


	public static int calcDistance (int coordinate1, int coordinate2) {
		double distance = Math.sqrt(Math.pow(coordinate1, 2) + Math.pow(coordinate2, 2));
		return (int) Math.ceil(distance);
	}

	public static int priceOfFlight (int distance) {
		if (distance%100 != 0) {
			return ((distance/100 + 1) * PRICE_FOR_100_KM);
		}
		else {
			return (distance/100 * PRICE_FOR_100_KM);
		}
	}

	public static long getCreditCardNumber() {
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Please enter your credit card number:");
		return scan1.nextInt();
	}

	private static boolean isCreditCardValid (long creditCardNumber) {
		if (creditCardNumber < 100000 || creditCardNumber > 999999) {
			return false;
		}
		long check = (creditCardNumber/10)%7;
		int lastDigit = (int) (creditCardNumber%10);
		if (check != lastDigit) {
			return false;
		}
		return true;
	}

	public static void creditCardValidationResult (long creditCardNumber) {
		if (isCreditCardValid(creditCardNumber)) {
			System.out.println("Your credit card is valid. Bon Voyage!");
		}
		else {
			System.out.println("Your credit card is not valid. You cannot buy the ticket.");
		}
	}

}
