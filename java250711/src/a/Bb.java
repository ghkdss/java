package a;


public class Taxi implements HasFare {
    private int farePerKm = 1000;

    // 인터페이스에서 요구한 메서드를 반드시 구현해야 함
    @Override
    public void calculateFare(int distance) {
        int total = farePerKm * distance;
        System.out.println("택시 요금은 " + total + "원입니다.");
    }
}



