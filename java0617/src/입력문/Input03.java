package 입력문;

import java.util.Scanner;

public class Input03 {
	public static void main(String[] args) {
//		nextLine은 다른것과 조금 다름
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b, c;
		
		System.out.print("첫번째 숫자 입력 : ");
		a = sc.nextInt();
		sc.nextLine(); // 엔터키 입력한거 처리
		System.out.print("두번째 문자열 입력 : ");
		c = sc.nextLine();
		
		System.out.println("===입력 결과===");
		System.out.println(a);
		System.out.println(c);
		
	}
}






