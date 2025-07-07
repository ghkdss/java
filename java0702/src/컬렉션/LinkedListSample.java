package 컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			arrayList.add(0, i);
		}
		end = System.nanoTime();
		
		System.out.println("ArrayList 처리 시간 : " + (end - start));
		
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			linkedList.add(0, i);
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList 처리 시간 : " + (end - start));
		
		
	}
}





