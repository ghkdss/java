package 숙제들;

import java.util.Scanner;

public class 연습05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 태어난 년도를 받아 미성년자면 프로그램이 종료되게 출력하고
		int since;

		for (;;) {

			System.out.println("==================");
			System.out.print("태어난 연도를 입력하세요: ");
			since = sc.nextInt();

			System.out.println(since + "년생");

			if (since >= 2007) {

				System.out.println("미성년자입니다.");
				System.out.println("입장할수 없습니다.");
				
				break;

			} else {

				System.out.println("성인입니다.");
				System.out.println("입장할수 있습니다.");
			}

		}

	}

}
