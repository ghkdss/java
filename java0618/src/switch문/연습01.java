package switch문;

import java.util.Scanner;

public class 연습01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		switch( num % 5 ) {
			case 0:
				System.out.println("5의 배수임");
				break;
			default:
				System.out.println("5의 배수 아님");
		}
		
	}
}





