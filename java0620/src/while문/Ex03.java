package while문;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt; // 학생수
		int i=1; // 반복용 변수
		int score; // 학생 성적 저장
		int sum = 0; // 성적 합계 저장
		
		System.out.print("인원수를 입력 : ");
		cnt = sc.nextInt();
		
		while( i <= cnt ) {
			System.out.print(i + "번째 학생 성적 입력 : ");
			score = sc.nextInt();
			
			sum = sum + score; // 입력한 성적들을 누적
			
			i++;
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / cnt);
		
		
	}
}










