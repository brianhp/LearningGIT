import java.util.Scanner;

public class LearningGIT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("This might take a while to figure out, but I think it will be worthwhile." + "\n");
		System.out.print("Let me know what this looks like on your end! (good/bad) ");
		String response = scr.next(); 

		if (response.equals("good")) {
			System.out.println("\nYay!");
		} else if (response.equals("bad")) {
			while (!response.equals("good")) {
				System.out.print("\nAre you sure? (good/bad) ");
				response = scr.next(); 
				if (!response.equals("good") && !response.equals("bad")) {
					System.out.println("\nYou are the reason user validation sucks so much.");
					System.out.print("\nAre you sure? (good/bad) ");
					response = scr.next(); 	
				}
			} 
			System.out.println("\nYay!");
		} else {	
			System.out.println("\nYou are the reason user validation sucks so much.");
		}
	}
}
