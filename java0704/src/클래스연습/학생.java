package 클래스연습;

public class 학생 extends 사람 {
	String 학교;
	int 반;
	
//	메서드 오버라이딩
	@Override
	public void printInfo(String a) {
		System.out.println("학생 메서드");
		super.printInfo( a );
//		System.out.println(이름 + " : " + 나이 + " : " + 성별 + " " + 전화번호 + " " + 학교 + " " + 반);
	}
	
	public void calc() {
		System.out.println("학생 전용메서드");
	}
	
	
}
