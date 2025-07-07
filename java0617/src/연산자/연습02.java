package 연산자;

import java.util.Scanner;

public class 연습02 {
	public static void main(String[] args) {
		// 변수 : 값을 저장하는 공간
		// 숫자, 문자, 문자열 결정, 이름 지정도 해줘야 함
		// int : 정수
		// double : 실수
		// char : 문자
		// String : 문자열
		// boolean : true/false
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		num = sc.nextInt();
//		
//		System.out.println(num);
		
		int math = 80;
		int eng = 50;
		
		System.out.println( (double)math / eng );
		System.out.println(math);
		
		int x=10;
		
		System.out.println( x % 2 == 1 ? "홀수" : "짝수" );
		System.out.println( x % 2 == 0 ? "짝수" : "홀수"  );
	}
}











