package 배열복사;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[10];
		
//		arr배열에 있는걸 그대로 arr2에 3번방부터 넣어주고 싶음
		
//		원시적인 방법
//		for(int i=0; i<arr.length; i++) {
//			arr2[i+3] = arr[i];
//		}
		// 깊은 복사
		System.arraycopy( arr, 3, arr2, 1, 2 );
		
		System.out.println(Arrays.toString(arr2));
		
		
		int[] arr3 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr3));
		
		arr[4] = 100;
		System.out.println("복붙 후 원본 값 수정");
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}
}











