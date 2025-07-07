package for문;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		int count=0; // 나눠 떨어지는 경우의 개수를 저장
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		for( i=1; i<=num; i++ ) {
			if( num % i == 0 ) {
				count++;	// count = count + 1;
			}
		}
		
		if( count == 2 )
			System.out.println("입력한 " + num + "은 소수입니다.");
		else
			System.out.println("입력한 " + num + "은 소수가 아닙니다.");
		
	}
}












