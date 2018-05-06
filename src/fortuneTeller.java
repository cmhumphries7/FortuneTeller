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
		String monthString;

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			System.out.println("Invalid month.");
			break;
		}

		input.nextLine();

		boolean hasColor = false;
		System.out.println("What is your favorite ROYGBIV color? Or enter 'help' for assistance.");
		String color;

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

		String vacationHome;
		
		if(siblings == 0) {
			vacationHome = "Toyko, Japan";
		
		} else if (siblings == 1) {
			vacationHome = "Montreal, Canada";
			
		} else if (siblings == 2) {
			vacationHome = "Miami, Florida";
			
		}
		
		
		
		
	}
}
