package IF문;

import java.util.Scanner;

public class 연습01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int max, min;
		double avg;
		
		System.out.print("점수 3개 입력 : ");
		score1 = sc.nextInt();
		max = score1;
		min = score1;
		
		score2 = sc.nextInt();
		if( score2 > max ) {
			max = score2;
		}
		if( score2 < min ) {
			min = score2;
		}
		
		score3 = sc.nextInt();
		if( score3 > max ) {
			max = score3;
		}
		if( score3 < min ) {
			min = score3;
		}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min);
		
		
		
		avg = (score1 + score2 + score3) / 3.0;
		
		if( avg >= 80 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		if( score1 > score2 && score1 > score3) {
			System.out.println("최대값 : " + score1);
			
		} else if( score2 > score1 && score2 > score3 ) {
			System.out.println("최대값 : " + score2);
			
		} else {
			System.out.println("최대값 : " + score3);
		}
		
		
		/*
		if( avg >= 70 && ( score1 < 60 || score2 < 60 || score3 < 60 ) ) {
			System.out.println("과락");
		} else if( avg >= 70 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		*/
		
		
		
		if( avg >=70 ) {
			if( score1 < 60 || score2 < 60 || score3 < 60) {
				System.out.println("과락");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
		
		
		
		
	}
}









