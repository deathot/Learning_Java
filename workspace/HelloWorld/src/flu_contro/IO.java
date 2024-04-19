package flu_contro;
import java.util.Scanner;

public class IO {
	public static void main(String[] args) {
/*
		System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        
        double q = 12900000;
        System.out.println(q); // 1.29E
        
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("In~name: ");
		String name = scanner.nextLine();
		System.out.print("In~age: ");
		int age = scanner.nextInt();
		System.out.printf("Hi, %s, u r %d years old", name, age);
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("first score: ");
		int first_score = scanner.nextInt();
		System.out.print("second score: ");
		int second_score = scanner.nextInt();
		double precent = 0.01;
		System.out.printf("成绩提高了%.2f%%\n", (second_score - first_score) / (precent * second_score));
	}
}
