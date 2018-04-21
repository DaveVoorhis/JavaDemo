import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {

	public static void main(String[] args) {
		// Some don't like Scanner. This is the classic Java way of getting console input.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter the year you were born: ");
		
		String userInput = null;
		try {
			userInput = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (userInput != null) {
			try {
				int yearBorn = Integer.parseInt(userInput);
				System.out.println("You were born in " + yearBorn);
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a number.");
			}
		}
	}

}
