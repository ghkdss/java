package aa;


class Drink extends Product {

	Drink() {
		
		System.out.println("자식클래스 생성자");
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Drink d = new Drink();

//		Product p = new Product("바지", 20000);
//		Drink d = new Drink("콜라", 2000);
		
		
		
	}
}
