package for문;

public class Ex09 {
	public static void main(String[] args) {

		int i, j;
		
		for(i=0; i<5; i++) {
			for(j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
