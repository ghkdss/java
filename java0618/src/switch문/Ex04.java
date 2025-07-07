package switch문;

public class Ex04 {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch( grade ) {
			case 'a', 'A' -> {
				System.out.println("우수");
			}
			case 'b', 'B' -> {
				System.out.println("일반");
			}
			default -> {
				System.out.println("보통");
			}
		}
		
		
	}
}
