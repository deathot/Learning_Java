package flu_contro;
import java.util.Scanner;

public class Ifjudge {
	public static void main (String[] args) {
/*		
		int n = 80;
		if (n >= 80) {
			System.out.print("well\n");
		} else if (n >= 60) {
			System.out.print("ok\n");
		} else {
			System.out.print("pity\n");
		}
		System.out.print("END\n");
*/
		
		//test
		Scanner scanner = new Scanner(System.in);
		System.out.print("height: ");
		double height = scanner.nextDouble();
		System.out.print("weight: ");
		double weight = scanner.nextDouble();
		double BMI = weight / (height * height);
		
		if (BMI > 32) {
			System.out.print("very fat\n");
		} else if (BMI >= 28) {
			System.out.print("fat\n");
		} else if (BMI >= 25) {
			System.out.print("very weight\n");
		} else if (BMI >= 18.5) {
			System.out.print("normal\n");
		} else {
			System.out.print("low weight\n");
		}
		System.out.print(BMI);
	}
}
