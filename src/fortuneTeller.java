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
		
		//put a restriction where birth month is 1-12//
		
		System.out.println("What is your favorite ROYGBIV color? Or enter 'help' for assistance.");
		String color = input.nextLine();
		System.out.println(color);
		
		switch (color.toLowerCase()) {
		case "help":
			color == help;
			System.out.println("ROYGBIV stands for red, orange, yellow, green, blue, indigo, and violet.");
			break;
		case "red":
			break;
		case "orange":
			break;
		case "yellow":
			break;
		case "green":
			break;
		case "indigo":
			break;
		case "violet":
			break;
		
		}
		
	
		input.nextLine();
		
		//add color list, not there tell user to type help. Help provides list of ROYGBIV colors
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
	}

}
