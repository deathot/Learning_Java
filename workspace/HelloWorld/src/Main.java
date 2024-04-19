public class Main{
	
	public static void main(String[] args) {
/*
		int x = 100;
		System.out.println("x = " +x);
		x = 200;
		System.out.println("x = " +x);
		
		int n = x;
		System.out.println("n = " +n);
		n += 100;
		System.out.println("n = " +n);
		
		x = 500;
		System.out.println("n = " +n);
		System.out.println("x = " +x);
		
		int i = (100 + 399) * (7 - 3);
		System.out.println(i);
		int i2 = 1234 / 32;
		System.out.println(i2);
		
		int i3 = 7;
		int i4 = i3 << 3;
		int i5 = i4 >> 3;
		System.out.println(i4);
		System.out.println(i5);
		
		n = 0 & 0; // 0
		n = 0 & 1; // 0
		n = 1 & 1; // 1
		
		n = 0 | 1; // 1
		
		n = ~0; // 1
		
		n = 0 ^ 1; //1
		n = 0 ^ 0; // 0
		
		System.out.println(i3 & 14);

		int i = 2132;
		short s = (short)i;

		//test
		int n = 100;
		int sum = 0;
		sum = (1 + n) * n / 2;
		System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");

		double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);

		double a = 1.0;
		double b = 3.0;
        double c = -4.0;
        double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
        double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");

		
		int age = 19;
		boolean isTeenager = age > 12 && age < 18;
		System.out.println(isTeenager);
		boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
        boolean result1 = true || (5 / 0 > 0);
        System.out.println(result1);
        int n = -100;
        int x = n <= 0? n: -n;
        System.out.println(x);

		int age = 7;
		boolean isPrimaryStudent = age > 6 && age < 12;
		System.out.println(isPrimaryStudent? "Yes" : "No");
		
		String s1 = "\"Hello";
		String s2 = "World";
		String s = s1 + ", " + s2 + "!\"";
		System.out.println(s);
		int age = 25;
        String s5 = "\"age is " + age + "\"";
        System.out.println(s5);
        
        String s6 = "first line \n"
                + "second line \n"
                + "end";
        System.out.println(s6);
        String s7 = """
                SELECT * FROM
                users
                WHERE id > 100
                ORDER BY name DESC
                """;
        System.out.println(s7);
       
        String s = "hello";
        System.out.println(s); // 显示 hello
        s = "world";
        System.out.println(s); // 显示 world
        
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world

		// tset
		int a = 72;
		int b = 105;
		int c = 65281;
		char a1 = (char)a;
		char b1 = (char)b;
		char c1 = (char)c;
		String s = "" + a1 + b1 + c1;
		System.out.println(s);
*/
		int[] ns = new int[5];
		ns[0] = 62;
		ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println(ns.length);
        //int[] ns1 = new int[] {1, 2, 4, 5};
        int[] ns1 = {1, 2, 4, 5};
        System.out.println(ns1.length);
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        
	}
}