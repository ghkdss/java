package switch문;

public class Ex01 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;

		System.out.println("num : " + num);
		switch( num ) {
			case 1:
				System.out.println("1이 나왔음");
				break;
			case 2:
				System.out.println("2 나옴");
				break;
			case 3:
				System.out.println("3 나옴");
				break;
			case 4:
				System.out.println("4 나옴");
				break;
			case 5:
				System.out.println("5 나옴");
				break;
			case 6:
				System.out.println("6 나옴");
				break;
		}
		
	}
}
