package 클래스01;

import java.util.Arrays;

public class Calculator {

	boolean status;
	
	// 전원 on / off 처리 메서드
	public void powerOnOff() {
		status = !status;
		
		if(status) {
			System.out.println("ON");
		} else {
			System.out.println("OFF");
		}
		
	}
	
	// 두수를 더한 결과를 반환해주는 메서드
	public int plus( int num1, int num2 ) {
		
		return num1 + num2 ;
	}
		
	// 두수를 나눈 결과를 반환해주는 메서드
	public double divide( int num1, int num2) {
		
		return (double) num1 / num2;
	}
	
	
	// 매개변수의 개수가 정해지지 않음
	// 여러개 숫자들의 합계를 리턴
	public int sum( int ... numbers ) {
		int sum = 0;
				
		for( int num : numbers ) {
			sum = sum + num;
		}
		
		return sum;
	}
	
	
	// 배열을 전달받아서 배열의 평균을 리턴 메서드
	public double average( int[] arr ) {
		int sum = 0;
		
		for(int num : arr) {
			sum = sum + num;
		}
		
		return (double) sum / arr.length;
	}
	
	public void test(int[] arr) {
		
		arr[2] = 100;
		
		
	}
	
	
	
	
	
	
	
	
}









