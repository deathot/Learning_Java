package flu_contro;
import java.util.Scanner;

public class SwitchChoice {
	public static void main(String[] args) {
/*		
		int option = 5;
		switch (option) {
		case 1 -> System.out.print("Selected 1\n");
	
		case 2 -> System.out.print("Selected 2\n");
		
		case 3 -> System.out.print("Selected 3\n");
	
		default -> 			System.out.print("Selected 0\n");

		String fruit = "apple";
		int opt = switch(fruit) {
		case "apple" -> 1;
		case "pear", "mango" -> 2;
		default -> 0;
		};
		System.out.print("opt = " +opt);

		int option = 76;
		String opt = switch (option) {
			case 1 -> "apple";
			
			case 2 -> "orange";
			
			case 3 -> "watermeelon";
			
			default -> {
				String str = "starry";
				yield str;
			}
		};
		System.out.print("opt = " + opt);
*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose any of the following\n");
		System.out.print("1: Rock\n");
		System.out.print("2: Scissors\n");
		System.out.print("3: Paper\n");
		int choice = scanner.nextInt();
		int random = 1 + (int)(Math.random() * 3);
		System.out.printf("computer: %d\n", random);
		
		switch (random) {
		case 1:
			switch (choice) {
			case 1:
				System.out.print("draw\n");
				break;
			case 2:
				System.out.print("u win\n");
				break;
			case 3:	
				System.out.print("computer win\n");
				break;
			}
			break;
			
		case 2:
			switch (choice) {
			case 1:
				System.out.print("u win\n");
				break;
			case 2:
				System.out.print("draw\n");
				break;
			case 3:	
				System.out.print("computer win\n");
				break;
			}
			break;
			
		case 3:
			switch (choice) {
			case 1:
				System.out.print("computer win\n");
				break;
			case 2:
				System.out.print("u win\n");
				break;
			case 3:	
				System.out.print("draw\n");
				break;
			}
			break;
		}
		System.out.print("End\n");
	}
}
