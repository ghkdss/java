package switch문;

import java.util.Scanner;

public class 연습02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char gender;
		
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0);
		
		switch( gender ) {
			case 'm':
			case 'M':
				System.out.println("남자");
				break;
			case 'f', 'F':
				System.out.println("여자");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}







