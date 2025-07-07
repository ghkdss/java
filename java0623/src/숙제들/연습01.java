package 숙제들;

import java.util.Scanner;

public class 연습01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price, count;
		double total;
		
		System.out.print("구매할 물건 개수 : ");
		count = sc.nextInt();
		System.out.print("구매할 물건 가격 : ");
		price = sc.nextInt();
		
		total = price * count;
		
		if ( count >= 5 && count <= 9 ) {
			total = total * 0.9;
		} else if( count >= 10 ) {
			total = total * 0.8;
		}
		
		if( count >= 10 ) {
			total = total * 0.8;
		} else if( count >= 5 ) {
			total = total * 0.9;
		}
		
		
	}
}



