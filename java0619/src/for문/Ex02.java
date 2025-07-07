package for문;

public class Ex02 {
	public static void main(String[] args) {
//		1부터 100까지 숫자들의 합
		int i, sum=0;
		
		System.out.println("sum\t=\tsum\t+\ti");
		for( i=1; i<=100; i++ ) {
			System.out.println((sum+i) + "\t=\t" + sum + "\t+\t" + i);
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
