package 배열;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 20;
		arr[1] = 5;
		arr[2] = 15;
		arr[3] = 40;
		arr[4] = 55;
		
		System.out.println( arr.length ); // 변수명.length : 배열 크기
		System.out.println("=========");
		for( int i=0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		// 향상된 for문
		// 자료형은 반복할 배열의 자료형과 일치
		// 반복할 배열에 있는 값을 순서대로 반복용 변수에 넣어서 실행
//		for( 자료형 반복용변수명 : 반복할배열 ) {
//			
//		}
		System.out.println("=======");
		for( int n : arr ) {
			System.out.println(n);
		}
		
	}
}







