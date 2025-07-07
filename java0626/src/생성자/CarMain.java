package 생성자;

public class CarMain {
	public static void main(String[] args) {
		
		Car taxi = new Car("소나타", "빨강", 2000);
//		Car bus = new Car();
		
		taxi.showInfo();
	}
}
