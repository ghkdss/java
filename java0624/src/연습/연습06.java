package 연습;

import java.util.Scanner;

public class 연습06 {

	public static void main(String[] args) {
		// 1 부터 [입력] 받은 숫자 까지 중에서
		// 3의 배수이면서 동시에
		// 5의 배수인 숫자만 찾아서 출력하는 프로그램을 만들어 보겠습니다.
		Scanner sc = new Scanner(System.in);

		int i; // 반복용 변수
		int num; // 입력 받을 숫자 변수

		System.out.print("숫자 입력 : "); // 숫자입력 : 프린트
		num = sc.nextInt(); // 입력값 넣을 스캐너를 num이란 변수에 저장

		for (i = 1; i <= num; i++) { // 반복문을 먼저 만들었습니다. 0 ~ num 까지 1씩 반복 증가
			if (i % 3 == 0) { // if문을 써서 3의 배수인 숫자를 먼저 찾았습니다. 예) 3, 6, 9, 12, 15, ...
				if (i % 5 == 0) { // if(3의 배수) 를 찾았으니 3의 배수들 중에서 5의 배수를 찾는 조건문 if설정 (코드는 위에서 아래로 실행되므로)
					// 코드 실행 >>> 3의 배수이면서 5의 배수
					System.out.println(i); // 3의 배수이면서 5의 배수 출력
				} // 코드 실행 >>> 3의 배수
			} // for (기초값; 조건식; 증감식)으로 num인 입력값까지 3의 배수이면서 5의 배수 계속 출력
				// if문은 조건식(true) 일때 코드가 실행되므로 true가 아니면 for문의 반복 증가 => 그러므로 1, 1+1 = 2, 2+1 =
				// 3, 3일때 if( i % 3 ==0 ) 실행
		}

		// 응용 버전

		System.out.print("숫자 입력 : ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			
		}

		//

	}

}





