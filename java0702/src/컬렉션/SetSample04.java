package 컬렉션;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSample04 {
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		TreeSet<Integer> tree = new TreeSet<>();
		LinkedHashSet<Integer> linked = new LinkedHashSet<>();
		
		while( lotto.size() < 6 ) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
			tree.add(num);
			linked.add(num);
		}
		
		System.out.println(lotto);
		System.out.println(tree);
		System.out.println(linked);
		
	}
}
