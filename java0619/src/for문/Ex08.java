package for문;

public class Ex08 {
	public static void main(String[] args) {
//		구구단 출력
		int i, j;
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.printf(j + "*" + i + "=" + (j*i) + " ");
				
			}
			System.out.println();
		}
		
		
		
	}
}
