package 복습;

public class CarMain {
	public static void main(String[] args) {
		
		Car taxi = new Car();
		Car bus = new Car();
		Tire nexen = new Tire();
		Tire kumho = new Tire();
		
		nexen.setTire("넥센", 20);
		kumho.setTire("금호", 23);
		
		nexen.showInfo();
		kumho.showInfo();

		taxi.setCar( "소나타", "은색", 2000 );
		bus.setCar( "대형버스", "검정색" , 5000 );
		
		taxi.setTire(nexen);
		bus.setTire(kumho);
		
		taxi.showInfo();
		bus.showInfo();
	}
}








