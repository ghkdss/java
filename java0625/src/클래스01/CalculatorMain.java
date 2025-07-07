package 클래스01;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		while(true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 전원 On / off ");
			System.out.println("2. 더하기 계산하기");
			System.out.println("3. 나누기 계산하기");
			
			switch ( sc.nextInt() ) {
			case 1:
				calc.powerOnOff();
				break;
			case 2:
				System.out.println("더할 두 수 입력");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				int result = calc.plus( num1, num2 );
				System.out.println("결과 : " + result);
				break;
				
			case 3:
				System.out.println("나누기할 두 수 입력");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				
				double result2 = calc.divide(num1, num2);
				System.out.println("결과 : " + result2);
				break;				
			}
			
			
		}
		
	}
}







