package 변수;

public class IntType {
	public static void main(String[] args) {
		int x = 0; // 초기화( 초기값 설정 )
		System.out.println(x);
		
		x = 5;
		System.out.print("x에 저장된 값은 : ");
		System.out.print(x);
		System.out.print("입니다.\n");
//		입력한 문자와 변수를 같이 출력하고 싶으면 +로 연결해서 사용함
		x = 10 + 5; // + - * /
		System.out.println("x에 저장된 값은 : " + x + "입니다.");
		
		System.out.println("x에 저장된 값은 : " + (x + 2) + "입니다.");
		
//		정수형 변수 a와 b를 만들고 싶음
//		a에는 10, b에는 20을 넣어줄거임
//		a와 b의 합을 출력 => "두수의 합은 : 30"
//		두수의 합을 사용해야 하는 경우가 많을 경우
		int a = 10, b = 20;
		int total;
		
		total = a + b;
		
		System.out.println("두수의 합은 : " + (a + b));
		System.out.println("두수의 합은 : " + total);
	}
}





