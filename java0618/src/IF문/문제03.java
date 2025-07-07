package IF문;

import java.util.Scanner;

public class 문제03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h, m;
		
		System.out.print("알람 설정 시간 입력 : ");
		h = sc.nextInt();
		System.out.print("알람 설정 분 입력 : ");
		m = sc.nextInt();
		
		m = m - 45;
		
		if( m < 0 ) {
			h--; // h = h-1 < 0 ? 23 : h-1
			m = m + 60;
		} 
		
		if( h < 0 )
			h = 23;
		
		
		System.out.println(h + " : " + m);
		
	}
}





