package a;

public class SmartBus extends PublicTransport implements HasStops, HasWiFi {

    public SmartBus(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void calculateFare(int distance) {
        System.out.println("버스 요금은 1500원 (거리 무관)");
    }

    @Override
    public void showNextStop(String stopName) {
        System.out.println("다음 정류장: " + stopName);
    }

    @Override
    public void connectWiFi() {
        System.out.println("버스 와이파이에 연결되었습니다.");
    }
}