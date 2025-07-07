package while문;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i=1; // 반복용 변수
		int sum=0, count=0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
				
		while( i <= num ) {
			if( i % 2 == 1) {
				sum = sum + i;
				count++;
			}
			i++;
		}
				
		System.out.println("합계 : " + sum);
		System.out.println("개수 : " + count);
				
	}
}









