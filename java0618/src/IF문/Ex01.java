package IF문;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		점수를 입력받아서 점수가 80이상이면 합격, 아니면 불합격
		Scanner sc = new Scanner(System.in); // 입력 기능을 가져옴
		
		int score;
		
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		if( score >= 80 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	
		// 참, 거짓일때 실행할 코드가 1줄이면 { }괄호 생략가능
		if( score >= 80 ) 
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		
		// 80이 넘으면 "참 잘했어요" 해주고 싶음
		
		// if문에 else는 필요없으면 생략 가능
		if( score >= 80 ) {
			System.out.println("참 잘했어요");
		} 
		
	}
}












