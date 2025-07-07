package 컬렉션;

import java.util.Arrays;
import java.util.HashSet;

public class SetSample03 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>( Arrays.asList(1,2,3,4,5,6) );
		HashSet<Integer> set2 = new HashSet<>( Arrays.asList(4,5,6,7,8,9) );
		HashSet<Integer> result = new HashSet<>(set1);
		
		result.addAll(set2);
		System.out.println(result);
		
		set1.retainAll(set2);
		System.out.println( set1 );
		
		result.removeAll(set1);
		System.out.println(result);
		
	}
}
