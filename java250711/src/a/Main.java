package a;

public class Main {

	public static void main(String[] args) {
        SmartBus bus = new SmartBus("스마트버스", 45);

        bus.start();
        bus.calculateFare(10);
        bus.showNextStop("강남역");
        bus.connectWiFi();
        bus.stop();
    }

}
