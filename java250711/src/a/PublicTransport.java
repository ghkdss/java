package a;

public abstract class PublicTransport {
    String name;
    int speed;

    public PublicTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void start() {
        System.out.println(name + " 출발합니다.");
    }

    public void stop() {
        System.out.println(name + " 멈췄습니다.");
    }

    public abstract void calculateFare(int distance);  // 자식이 꼭 구현해야 함
}

