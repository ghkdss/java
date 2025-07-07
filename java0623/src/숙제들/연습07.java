package 숙제들;

import java.util.Scanner;

public class 연습07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int num1, num2, i, sum = 0;
			int temp;

			System.out.print("입력 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
//			num1에는 작은값, num2에는 큰값이 들어가도록 처리
			if( num2 < num1 ) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(i = num1; i <= num2; i++) {
				sum = sum + i;
			}
			
			

			if (num1 < num2) {
				for (i = num1; i <= num2; i++) {
					sum = sum + i;
				}
			} else {
				for (i = num2; i <= num1; i++) {
					sum = sum + i;
				}
			}

			System.out.println("합계 : " + sum);

			if (sum % 2 == 0) {
				System.out.println("결과 : 짝수");
			} else {
				System.out.println("결과 : 홀수");
			}

		}
	}
}
