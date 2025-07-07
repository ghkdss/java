package 상속;

public class 전자제품 {
	String 제조사;
	int 전력사용량;
	String 브랜드;
	
	public void on() {
		System.out.println("전원을 킵니다.");
	}
	
	public void off() {
		System.out.println("전원을 끕니다.");
	}
	
	public void showInfo() {
		System.out.println(제조사 + " : " + 전력사용량);
	}
}



