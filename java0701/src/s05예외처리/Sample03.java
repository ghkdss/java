package s05예외처리;

public class Sample03 {
	public static void main(String[] args) {

		System.out.println("메인 실행");
		
		try {
			int a = test();
			a = a + 10;
			a--;
			System.out.println(a);
		} catch(Exception e) {
			System.out.println( e.getMessage() );
			System.out.println("메인 예외발생 - 메서드 호출 문제");
		}
	}

	public static int test() throws Exception {
		Integer a = null;
		
		try {
			System.out.println("테스트 메서드 실행");
			a = 10/0;
		} catch(Exception e) {
			System.out.println("test메서드 예외 발생");
			throw new Exception("0나누기 안됨!!");
		}
		
		return a;
	}
	
}




