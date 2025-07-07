package 생성자;

public class Car {

	String model;
	String color;
	int price;
	
	Car() {
		
	}
	
	Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}



	public void showInfo() {
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
	}
	
	
	
	
	
}







