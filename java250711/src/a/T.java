package a;

public class Taxi implements HasFare {
    private int farePerKm = 1000;
}
public class T {

	
	public static void main(String[] args) {
		
		        Taxi taxi = new Taxi();
		        taxi.calculateFare(5);  // 결과: 택시 요금은 5000원입니다.
		    
		

	}

}
