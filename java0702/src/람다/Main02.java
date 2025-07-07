package 람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main02 {
	public static void main(String[] args) {
//		매개변수가 없고, 리턴만 해주는 함수 ( 제네릭에는 리턴 타입 )
		Supplier<String> sup = () -> {
			System.out.println("aaaa");
			System.out.println("bbb");
			return "hello";
		};
		System.out.println( sup.get() ); 
		
//		매개변수가 있고, 리턴은 안해주는 함수 ( 제네릭에는 매개변수 타입 )
		Consumer<Integer> con = num -> System.out.println("숫자 : " + num);
		con.accept(123);
		
//		매개변수와 리턴이 둘다 있음 ( 제네릭은 첫번째가 매개변수 타입, 두번째가 리턴타입 )
		Function<Integer, String> func = num -> {
			if( num % 2 == 0)
				return "짝수";
			else
				return "홀수";
		};
		
		String result = func.apply(23);
		System.out.println( result );
		
//		매개변수를 받음 조건판별 후 결과를 리턴 ( 제네릭은 매개변수의 타입 )
		Predicate<Integer> pre = num -> num % 2 == 0;
		System.out.println( pre.test(3) );
		System.out.println( pre.test(4) );
		
	}
}








