package 연습;

import java.util.Arrays;
import java.util.Scanner;

/*
	KBO야구 팀(5구단)의 승, 패 입력 후
	5개구단의 승, 패, 승률, 순위를 출력
	
	LG, KIA, 두산, 롯데, 삼성
*/

public class 문제02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] team = {"LG", "KIA", "두산", "롯데", "삼성"};
		int[] win = new int[5]; // 5개 구단 승수 저장
		int[] loss = new int[5]; // 5개 구단 패수 저장
		double[] rate = new double[5]; // 5개 구단 승률
		int[] rank = new int[5]; // 5개 구단 순위
		
		
		for(int i=0; i<team.length; i++) {
			System.out.print(team[i] + " 승 입력 : ");
			win[i] = sc.nextInt();
			System.out.print(team[i] + " 패 입력 : ");
			loss[i] = sc.nextInt();
			
			double rate_ = (double) win[i] / (win[i] + loss[i]) ;
			
			// Math.round는 반올림할 자리수 설정이 안됨 - 무조건 소수 첫째자리에서 반올림
			// 만약 소수 둘째자리까지 표현을 하려면? 
			rate_ = Math.round( rate_ * 100 ) / 100.0;
			
			rate[i] = rate_;
		}
		
		// 순위 계산
		for(int i=0; i<5; i++) {
			rank[i] = 1;
			for(int j=0; j<5; j++) {
				if(rate[i] < rate[j]) {
					// 나보다 크면 순위가 밀려남
					rank[i]++;
				}
			}
		}
		
		System.out.println("====================");
		System.out.println("구단명\t승\t패\t승률\t순위");
		for(int i=0; i<team.length; i++) {
			System.out.println(team[i] + "\t" + win[i] + "\t" + loss[i] + "\t" + rate[i] + "\t" + rank[i]);
		}
		
		
	}
}












