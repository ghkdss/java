package 숙제;

import java.util.Arrays;

public class 정렬문제 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j=0; j<i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
		
		int temp;
		// 셀렉션 정렬
		for(int i=0; i<lotto.length-1; i++) {
			
			for(int j=i+1; j<lotto.length; j++) {
				
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
					
				}
				
			}
			
		}
		
		
		
		
		
		System.out.println(Arrays.toString(lotto));
	}
}










