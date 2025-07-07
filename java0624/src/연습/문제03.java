package 연습;

import java.util.Scanner;

public class 문제03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int menu;
		int result;
		
		while(true) {
			System.out.println("=== 구구단 퀴즈 ===");
			System.out.println("1. 구구단 퀴즈 시작");
			System.out.println("2. 종료");
			System.out.print("번호 선택 : ");
			menu = sc.nextInt();
			
			if(menu == 2) {
				System.out.println("종료 합니다.");
				break;
			} else if(menu != 1) {
				System.out.println("잘못입력");
				continue;
			}
			
			num1 = (int) (Math.random() * 9) + 1;
			num2 = (int) (Math.random() * 9) + 1;
			
			result = 0;
			
			while(num1*num2 != result) {
				System.out.print(num1 + " * " + num2 + " = ");
				result = sc.nextInt();
				
				if(num1*num2 == result) {
					System.out.println("정답");
				} else {
					System.out.println("오답 다시 푸셈");
				}
				
			}
			
			
		}
		
		

	}
}





