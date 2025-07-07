package 배열;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		// max를 왜 0으로 초기 설정함?
		// 배열에 있는 숫자들의 범위는 1~1000
		// 가장 첫번째 배열에 있는 숫자와 max를 비교해서
		// 무조건 첫번째 숫자가 max로 지정되도록 처리할 예정
		// 결국 max와 배열방 숫자와 비교해서 배열방 숫자가 더 크면 max가 되도록 처리
		int max = 0;
		int min = 1001;
		
		int max_index=0; // 최대값의 인덱스(위치)를 저장
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000) + 1;
		}
		// ==== 랜덤값이 배열에 다 들어가 있음 ====
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				max_index = i;
			}	
		}
		
		System.out.println("최대값 : " + max);
		
		
		
		System.out.println( Arrays.toString(arr) );
		
	}
}
