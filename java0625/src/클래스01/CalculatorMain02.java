package 클래스01;

import java.util.Arrays;

public class CalculatorMain02 {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		System.out.println( c.sum(1) );
		System.out.println( c.sum(1, 2, 3) );
		System.out.println( c.sum(1, 2, 3, 4, 5, 6, 7, 8) );
		
		
		int[] arr = { 10, 20, 33, 40, 50 };
		
		System.out.println( c.average(arr) );
		System.out.println(arr);
		c.test(arr);
		System.out.println(Arrays.toString(arr));
	}
}























