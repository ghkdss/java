package 도서관리;

public class Test {

	public static void main(String[] args) {
		
		// 못찾으면 false 찾으면 true
		boolean isFound = true;
		
		System.out.println( !isFound );
		
//		if(true) 실행됨
		
		if(!isFound)
			System.out.println("못찾음");
	}

}
