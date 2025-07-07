package 연습;

import java.util.Arrays;

public class 연습07 {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j=0; j<i; j++) {
				
				if(lotto[i] == lotto[j]) {
					// 새로 넣은 값이랑 기존값이랑 같은 경우
					// 중복된 경우이므로 다시 새로운 값으로 바꿔줘야함
					// 바꿨으면 다시 검사해야 함
					lotto[i] = (int)(Math.random() * 45) + 1;
					j=-1;
				}
				
			}
		}
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j=0; j<i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
		
		
		
		
		
		System.out.println(Arrays.toString(lotto));
		

	}
}








