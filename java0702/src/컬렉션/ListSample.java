package 컬렉션;

import java.util.ArrayList;

public class ListSample {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동"); // 0
		list.add("고길동"); // 1
		System.out.println(  list.add("유재석")   ); // 2
		
		list.add(0, "가나다");
		
		System.out.println( list.toString() );
		
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) ); // 배열[i]
			
		}
		
//		해당배열에 xxx가 있는지 검색 -> 반복돌려서 하나하나 검사
//		List는 메서드로 하면 됨
		System.out.println(  list.contains("홍길동")  );
		System.out.println(  list.contains("홍동")  );
		
//		삭제
		System.out.println(  list.remove(0)   );
		System.out.println(  list.remove("고길동")  ); 
		
		System.out.println( list );
		
		
		
	}
}





