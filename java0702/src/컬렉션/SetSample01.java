package 컬렉션;

import java.util.Arrays;
import java.util.HashSet;

public class SetSample01 {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("고길동");
		set.add("김자바");
		set.add("고길동");
		
		set.addAll( Arrays.asList("파이썬", "JS") );
		
		set.remove("파이썬");
		
		System.out.println(set);
		
	}
}







