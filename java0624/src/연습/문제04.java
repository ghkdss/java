package 연습;

import java.util.Scanner;

public class 문제04 {
	public static void main(String[] args) {
		// 100이하의 정수를 입력받아
		// 입력 받은 정수 부터 100까지의 합을 출력하는 프로그램

		Scanner sc = new Scanner(System.in);

		int i;
		int sum = 0;
		int num;

		System.out.print("0~100까지의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		// i는 입력 받은 수 num, 100까지의 수가 지정되어 있으므로 100보다 
//		   작거나 크다의 범위 지정 , 입력받은 수부터 100이 될떄 까지
		// 반복
		for (i = num; i <= 100; i++) {
			sum += i; // 변수 섬의 값을 누적 ( sum = sum + i )
		}

		System.out.print("지정숫자부터 100까지의 총합은:" + sum); // 최종 결과값 출력
	}
}










