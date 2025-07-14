package 정수훈;

@FunctionalInterface
interface Calculator {
	int add(int a, int b);
}

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(calc.add(3, 5)); // 출력: 8
		
//		Calculator calc = (a, b) -> a + b;
//		System.out.println(calc.add(3,5)); // 출력: 8
		
//		(매개변수) -> { 실행 코드 }
	}
}
