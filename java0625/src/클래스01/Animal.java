package 클래스01;

public class Animal {
	String name;
	int age;
	
	// 이름과 나이를 출력해주는 메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// 반려동물 나이에서 5 곱한 결과를 다시 되돌려주는 메서드
	public int mulAge() {
		int x = age * 5;
		
		return x;
	}
	
}











