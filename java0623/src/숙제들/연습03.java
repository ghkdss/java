package 숙제들;

import java.util.Scanner;

public class 연습03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 항공사 이름들을 저장하는 배열
		String[] air = {"진에어", "아시아나", "에어서울"};
		// 항공사별 항공권 금액을 저장하는 배열
		int[] price = {624300, 650000, 612800};
		int num; // 항공사 선택한 번호를 저장
		int count; // 항공권 수량 저장
		int total; // 총 금액 저장
		
		System.out.println("===항공사 선택===");
		for(int i=0; i<air.length; i++) {
			System.out.println( (i+1) + ". " + air[i] + " - " + price[i] + "원");
		}
		
		System.out.print("원하시는 항공사를 선택 : ");
		num = sc.nextInt();
		
		System.out.println( air[num-1] + "를 선택하셨습니다." );
		
		System.out.print("수량 입력 : ");
		count = sc.nextInt();
		
		total = price[num-1] * count; // 총 금액 계산
		
		if( total >= 1300000 ) {
			total = (int) (total * 0.9);
		}
		
		System.out.println("총 금액 : " + total);
		
	}
}










