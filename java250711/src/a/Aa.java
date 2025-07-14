package a;

public class Aa {

	public static void main(String[] args) {
		// 인터페이스
		
//		- 자바에서는 자식 클래스는 부모 클래스를 단 하나만 가질 수 있음
//		- 그렇지만 자식 클래스가 여러 부모 클래스를 가질 때의 장점을 사용하기 위해 인터페이스를 만듦
//		- 인터페이스는 “설계도”이기 때문에 객체를 직접 만들 수 없음
//
//		그래서 필드는 모두 public static final 상수로만 사용
		
		비유로 이해하자면

		인터페이스 = “운전 가능한 것” 이라는 기능 자격증

		클래스 = 자동차, 오토바이 등 실체

		인터페이스를 구현한 클래스는 운전기능을 반드시 제공해야 함
		
		showNextStop() 이라는 기능을 갖고 있어야 한다고 약속만 하고

		어떻게 구현할지는 클래스가 정함
		
		public interface HasStops {
		    void showNextStop(String stopName);
		}
		
	}

}
