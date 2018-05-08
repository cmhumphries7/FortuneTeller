import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class fortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("Which month were you born?");
		int month = input.nextInt();
		int monthInt;

		switch (month) {
		case 1:
			monthInt = 1;
			break;
		case 2:
			monthInt = 2;
			break;
		case 3:
			monthInt = 3;
			break;
		case 4:
			monthInt = 4;
			break;
		case 5:
			monthInt = 5;
			break;
		case 6:
			monthInt = 6;
			break;
		case 7:
			monthInt = 7;
			break;
		case 8:
			monthInt = 8;
			break;
		case 9:
			monthInt = 9;
			break;
		case 10:
			monthInt = 10;
			break;
		case 11:
			monthInt = 11;
			break;
		case 12:
			monthInt = 12;
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}

		input.nextLine();

		String color = "";
		boolean hasColor = false;
		System.out.println("What is your favorite ROYGBIV color? Or enter 'help' for assistance.");

		while (hasColor == false) {
			color = input.nextLine();
			if (color.equals("red") || color.equals("orange") || color.equals("yellow") || color.equals("green")
					|| color.equals("blue") || color.equals("indigo") || color.equals("violet")) {
				hasColor = true;

			} else if (color.equals("help")) {
				System.out.println("ROYGBIV stands for red, orange, yellow, green, blue, indigo, and violet.");
				hasColor = false;

			} else {
				System.out.println("Sorry, that color is not apart of ROYGBIV.");
				hasColor = false;
			}
		}

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		int retirementAge;

		if (age % 2 == 0) {
			retirementAge = 20;
		} else {
			retirementAge = 30;
		}

		String vacationHome = null;

		if (siblings == 0) {
			vacationHome = "Toyko, Japan";

		} else if (siblings == 1) {
			vacationHome = "Montreal, Canada";

		} else if (siblings == 2) {
			vacationHome = "Miami, Florida";

		} else if (siblings == 3) {
			vacationHome = "your mother's basement";

		} else if (siblings > 3) {
			vacationHome = "Topeka, Kansas";

		} else if (siblings < 0) {
			vacationHome = "Atlantis, The Ocean";

		}

		String modeOfTransportation = "";

		if (color.equals("red")) {
			modeOfTransportation = "Mini-Cooper";

		} else if (color.equals("orange")) {
			modeOfTransportation = "a wild stallion";

		} else if (color.equals("yellow")) {
			modeOfTransportation = "Jaguar";

		} else if (color.equals("green")) {
			modeOfTransportation = "a flying carpet";

		} else if (color.equals("blue")) {
			modeOfTransportation = "a Tardis";

		} else if (color.equals("indigo")) {
			modeOfTransportation = "a pickup truck";

		} else if (color.equals("purple")) {
			modeOfTransportation = "DeLorean";
		} else {
			modeOfTransportation = "a segway";
		}

		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		double bankBalance;

		if (month > 0 && month < 5) {
			bankBalance = 999999.99;
		}

		else if (month > 4 && month < 9) {
			bankBalance = 252.78;
		}

		else if (month > 8 && month < 13) {
			bankBalance = 200875.45;
		}

		else {
			bankBalance = 0.00;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years with "
				+ formatter.format(bankBalance) + " in the bank, a vacation home in " + "" + vacationHome
				+ ", and travel by " + modeOfTransportation + ".");
	}
}
