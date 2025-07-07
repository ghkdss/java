package 연습;

import java.util.Scanner;

public class 문제01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String age;
		int max=0;
		
		while(true) {
			System.out.print("나이 입력 (0.종료, 01. 최대나이출력) : ");
			age=sc.next();
			
			if( age.equals("0") ) {
				System.out.println("종료");
				break;
			}
			
			if( age.equals("01") ) {
				
				if(max == 0) {
					System.out.println("입력된 나이가 없음");
					continue;
				} else {
					System.out.println("최대 나이 : " + max);
					break;
				}
				
			}
			
//			문자인 age를 정수로 변환 후 age_ 변수에 임시 저장
			int age_ = Integer.parseInt(age);
			
			if(age_ <= 10) {
				System.out.println("어린이 : 1000원");
			} else if(age_ <= 20) {
				System.out.println("청소년 : 1200원");
			} else {
				System.out.println("성인 : 5000원");
			}
			
			if( age_ > max ) {
				max = age_;
			}
			
			
			
		}
		

	}

}













