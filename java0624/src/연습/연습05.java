package 연습;

import java.util.Scanner;

public class 연습05 {
	public static void main(String[] args) {
		// 고등학교 2학년 360명 점수를 구하여
		// 총 합과 평균 구하기
		final int STUDENT_COUNT = 360;
		Scanner sc = new Scanner(System.in);
		
		int [] scores = new int[STUDENT_COUNT] ;  //전교생 수
		int sum = 0;
		System.out.println(" 총 360명의 학생의 점수를 입력하세요 ");

		// 총 학생 점수 입력
		for(int i=0 ; i<STUDENT_COUNT; i++){
			System.out.println((i + 1) + " 번 학생점수 입력 : " );
			scores[i] = sc.nextInt();
			
			sum += scores[i];  // 총점 계산
		}
		
		// 360명의 평균 구하기
		double average =(double) sum/ STUDENT_COUNT;

		System.out.println("전체 학생 총점 ; " + sum + "점");
		System.out.printf("전교 평균 : %.2f점", average );

	}
}










