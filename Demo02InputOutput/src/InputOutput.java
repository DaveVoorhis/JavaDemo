import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// A scanner is useful for reading input.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the year you were born: ");
		// Note that String is a class, equivalent to C#'s string
		String userInput = scanner.nextLine();
		
		// This can throw exceptions that we should probably catch...
		int yearBorn = Integer.parseInt(userInput);
		System.out.println("You were born in " + yearBorn);
		
		// Yes, you should have this.
		scanner.close();
	}

}
