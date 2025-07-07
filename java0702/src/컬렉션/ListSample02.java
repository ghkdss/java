package 컬렉션;

import java.util.ArrayList;

public class ListSample02 {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<>();
		
		list.add( new Person("홍길동", 20) );
		
		Person p = new Person("김씨", 30);
		list.add(p);
		
		System.out.println( list );
		
		for(int i=0; i<list.size(); i++) {
			Person pp = list.get(i);
			
			System.out.println( pp.getName()  );
			
		}
		
		
		for( Person person : list ) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
		
	}
}









