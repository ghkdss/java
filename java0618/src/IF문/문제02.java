package IF문;

import java.util.Scanner;

public class 문제02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count; // 주문수량을 저장하는 변수
		final int PRICE = 12000; // 상수
		
		System.out.print("주문수량 입력 : ");
		count = sc.nextInt();
		
		System.out.println("주문금액 : " + PRICE * count);
				
		if( PRICE * count <= 15000 ) {
			System.out.println("배달비 : 3000원");
		} else if( PRICE * count <= 30000 ) {
			System.out.println("배달비 : 1500원");
		} else {
			System.out.println("배달비 : 무료");
		}
		
	}
}
