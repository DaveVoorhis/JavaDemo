import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// A scanner is useful for reading input.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the year you were born: ");
		
		// This can throw exceptions that we should probably catch...
		int yearBorn = scanner.nextInt();
		System.out.println("You were born in " + yearBorn);
		
		// Yes, you should have this.
		scanner.close();
	}

}
