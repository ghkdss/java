package 숙제들;

import java.util.Scanner;

public class 연습04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = ""; // 2진수를 저장

		System.out.print("입력값 : ");
		int n = sc.nextInt();
		
		// 아까 파악 -> 2로 나누려는 값이 0이되면 반복 종료
		while( n > 0 ) {
			result = (n % 2) + result;
			n = n / 2;
			
		}

		System.out.println(result);

	}

}









