package 숙제들;

import java.util.Scanner;

public class 연습09 {
	public static void main(String[] hargs) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0; // 총합
		double avg; // 평균
		int max, min; // 최대값, 최소값
		int odd=0, even=0; // 홀수, 짝수 개수

		System.out.print("입력할 개수 : ");
		int count = sc.nextInt();
		
		int[] arr = new int[count];
		
//		입력한 값을 배열방에 넣어주는 반복문
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		
//		숫자들의 합계와 짝수, 홀수 개수 구하는 반복문
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
			if(arr[i] % 2 == 1)
				odd++;
			else
				even++;
		}
		
//		최대값 최소값 구하기
		max = arr[0];
		min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] > max)
				max = arr[i];
			
			if(arr[i] < min)
				min = arr[i];
			
		}
		
		avg = (double)sum / count;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("짝수 개수 : " + even);
		System.out.println("홀수 개수 : " + odd);
			
		
	}

}














