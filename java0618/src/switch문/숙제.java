package switch문;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;		// 선택한 메뉴 번호 저장
		int count;		// 주문 수량 저장
		int total = 0;	// 최종 금액
		int price = 0;	// 메뉴 한잔 가격
		String coupon;  // 쿠폰번호 저장
		
		for(;;) {
		
			System.out.println("=== 카페에 오신걸 환영합니다 ===");
			
			System.out.println("= 메뉴를 선택해주세요 =");
			System.out.println("1. 아이스 아메리카노 - 2000원");
			System.out.println("2. 아샷추 - 2500원");
			System.out.println("3. 라떼 - 2500원");
			System.out.println("4. 딸기 스무디 - 4000원");
			System.out.println("5. 프로그램 종료");
			
			System.out.print("선택 번호 : ");
			menu = sc.nextInt();
			
			if( menu == 5 ) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			// 메뉴 선택하면 선택한 메뉴의 가격을 저장
			switch( menu ) {
				case 1:
					System.out.println("아이스 아메리카노를 선택하셨습니다.");
					price = 2000;
					break;
				case 2:
					System.out.println("아샷추를 선택하셨습니다.");
					price = 2500;
					break;
				case 3:
					System.out.println("라떼를 선택");
					price = 2500;
					break;
				case 4:
					System.out.println("딸기 스무디 선택");
					price = 4000;
					break;
				default:
					System.out.println("잘못입력하심");
					continue;
			}
			
			// 해당 음료를 몇잔 주문할건지
			System.out.print("주문 수량 입력 : ");
			count = sc.nextInt();
			
			total = price * count;
			System.out.println("총 주문금액 : " + total);
			
			System.out.print("할인쿠폰을 적용하시겠습니까( Y / N ) ? ");
			
			switch( sc.next().charAt(0) ) {
				case 'Y':
				case 'y':
					System.out.print("쿠폰 번호를 입력하세요 : ");
					coupon = sc.next();
					
					if( coupon.equals("ABCDE") )
						total = (int)(total * 0.9);
					else
						System.out.println("잘못된 쿠폰번호입니다.");
						
					break;
			}
			
			System.out.println("최종 금액 : " + total);
		}
	}
}












