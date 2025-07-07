package 배열;

public class Ex03 {
	public static void main(String[] args) {
//		배열 선언과 초기화
		int[] arr = new int[5]; // 빈 배열 5칸 생성 - 모든 배열방은 0으로 초기값 설정
//		배열 선언과 동시에 값 지정
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		
		int a;
		a = 10; // 변수 선언 후 뒤에 값 지정이 가능
		int[] arr2;
//		arr2 = {1, 5, 10}; // 배열변수 선언 후 값지정 불가능
		arr2 = new int[] { 1, 5, 10 }; // 지정하려면 new 와 함께 배열 생성
		
	}
}
