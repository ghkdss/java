package 연산자;

public class 논리 {
	public static void main(String[] args) {
//		비교 / 논리 연산자
		System.out.println( 5 >= 10 );
		System.out.println("abc" == "ABC");
		
		int a = 100, b = 80;
		boolean result = a > b;
		
		System.out.println( result );
		
		int math = 80, eng = 50;
		
//		수학과 영어점수가 80이상인지..? and
		System.out.println( math >= 80 && eng >= 80 );
		
		boolean r = math >= 80 || eng >= 80;
		
		System.out.println(r); // true
		
		System.out.println(!r); // false
		
		
//		math >= 80 || eng >= 80 && kor == 100 || a == 1
		
		
		int x = 10;
		
		System.out.println(x * 2);
		System.out.println(x << 1);
		
		System.out.println(x / 2);
		System.out.println(x >> 1);
		
		
		x = 10;
//		0000 1010
//		1111 0101
		
//		가장 앞부분은 부호부로 처리
//		음수를 10진수로 출력하려면 2의보수 수행
//		1000 1010 : 가장 앞 부호부는 제외하고 1의 보수 처리 결과
//		1000 1011 : 2의보수 처리 결과
		
		System.out.println(~x);
		
		
		int score = 50;
		
		System.out.println( score >= 80 ? "A" : "F" );
		
		String re = score >= 80 ? "A" : "F";
		
		
		
		
	}
}









