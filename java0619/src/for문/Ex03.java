package for문;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int sum=0;
		int i;
		int temp; // 교환 시 임시 저장
		
		
		System.out.print("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
//		num1에는 작은값, num2 큰값이 있도록 처리할 예정
		if( num1 > num2 ) {
//			의도와는 다르게 num1에 큰값이 있으므로 두 변수에 숫자를 교환
			temp = num1;
			num1 = num2;
			num2 = temp;		
		}
		
		for( i=num1; i<=num2; i++ ) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
//		int max, min;
//		
//		if( num1 < num2 ) {
//			min = num1;
//			max = num2;
//		} else {
//			min = num2;
//			max = num1;
//		}
//		// 위 if가 처리되면 항상 min에는 작은 값이 max에는 큰값이 들어가게됨
//		// 그래서 for문은 min부터 max까지 반복하면 끝
//		for( i=min; i<=max; i++ ) {
//			sum = sum + i;
//		}
		
//		if( num1 < num2 ) {
//			// num1 작고 num2 큰거 - num1부터 num2까지 반복
//			for( i=num1; i<=num2; i++ ) {
//				sum = sum + i;
//			}
//			
//		} else {
//			// num2 작고 num1 큰거 - num2부터 num1까지 반복
//			for( i=num2; i<=num1; i++ ) {
//				sum = sum + i;
//			}
//		}
		
//		System.out.println(sum);
		
		
	}
}







