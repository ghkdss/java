package 문제3;

public class Test {
	
	public static void add(int a, int b) {
		a = a + 10;
		b = b + 20;
	}

	public static void add(Num num) {
		num.a = num.a + 10;
		num.b = num.b + 20;
	}
	
	public static void main(String[] args) {
		Num num = new Num();
		num.a = 5;
		num.b = 15;
		
//		add(num.a, num.b);
		add(num);
		
		System.out.println(num.a);
		System.out.println(num.b);
		
	}
}
