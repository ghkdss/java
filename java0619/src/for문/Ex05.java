package for문;

public class Ex05 {

	public static void main(String[] args) {
		int i;
		int count=0;
		
		for(i=101; i<=110; i++) {
			if( i % 3 == 0 )
				count++;
		}
		
		System.out.println(count);

	}

}
