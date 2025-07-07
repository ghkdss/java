package 연산자;
// 책 80p
public class Test01 {
	public static void main(String[] args) {
//		증감 연산자 ( ++, -- )
		int a = 10;
			
		System.out.println(++a); // 11
		System.out.println(a); // 11
		
		System.out.println(a++); // 11
		System.out.println(a); // 12
		
		// % : 나눈 값의 나머지를 구해주는 연산자
		System.out.println(a % 5);
		
		int b = 10;
		
		b += 5; // b = b + 5 와 같은거임
		System.out.println(b); // 15
		
		b /= 5; // b = b / 5
		System.out.println(b); // 3
		
		b *= 2; // b = b * 2
		System.out.println(b); // 6
	}
}










