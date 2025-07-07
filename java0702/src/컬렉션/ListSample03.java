package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSample03 {
	public static void main(String[] args) {

		String[] arr = {"123", "456", "234"};
		
		ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );
		
		System.out.println(list);
		
		list.sort( Comparator.naturalOrder() );
		
		System.out.println(list);
		
		list.sort( Comparator.reverseOrder() );
		
		System.out.println(list);
		
	}
}





