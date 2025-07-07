package 숙제들;

import java.util.Scanner;

public class 연습08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		char check;

		while (true) {

			System.out.println("어서오세요 홀 or 짝을 골라주십시오");

			System.out.print("입력 해주세요 : ");
			check = sc.next().charAt(0);

			num1 = (int) (Math.random() * 6) + 1;
			
//			if( check != '짝' || check != '홀' )
//				continue;
//			
//			System.out.println(check + "입력함");

			switch (check) {

			case '짝':
				System.out.println("짝을 입력하셨습니다");
				break;
			case '홀':
				System.out.println("홀을 입력하셨습니다");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				continue;

			}

			if (num1 % 2 == 0) {
				System.out.println("결과는 짝 " + num1);

			} else
				System.out.println("결과는 홀 " + num1);

		}

	}

}
