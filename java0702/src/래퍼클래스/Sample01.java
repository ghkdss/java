package 래퍼클래스;

public class Sample01 {
	public static void main(String[] args) {
		Integer num = new Integer(20);  // 박싱
		int n = num.intValue();		// 언박싱
		
		Character ch = 'x'; // new Character('x') : 오토 박싱
		char c = ch; // ch.charValue(); : 오토 언박싱
		
		
		// 오토 박싱 ( 자바가 자동으로 기본타입인 정수를 객체로 변환함 )
		Integer num1 = 7;
		Integer num2 = 10;
		
		// 오토 언박싱( 자바가 자동으로 객체를 기본타입으로 변환 )
		int a = num2;
		int b = num1;
		
		
		int r1 = num1 + a;
		Integer r2 = num2 + b;
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		Integer n1 = 10;
		Integer n2 = 20;
		Integer n3 = 10;
		Integer n4 = new Integer(10);
		Integer n5 = new Integer(10);
		
		System.out.println( n1 < n2 );
		System.out.println( n1 == n3 );
		System.out.println( n4 == n5 );
		System.out.println( n4.equals(n5) );
		
	}
}






