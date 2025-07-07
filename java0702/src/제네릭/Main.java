package 제네릭;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student<Integer> s1 = new Student<>();
		
		s1.name = "aaaa";
		s1.setScore(10);
		
		Student<String> s2 = new Student<>();
		
		s2.name = "bbbb";
		s2.setScore("A");
		
		List< Student<Integer> > list = new ArrayList<>();
		
		
	}
}




