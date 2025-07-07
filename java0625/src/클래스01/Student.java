package 클래스01;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	
	// 점수총합의 합계를 기준으로 상중하를 출력해주는 메서드
	public void printGrade( int sum ) {
		
		if(sum >= 250)
			System.out.println("상");
		else if(sum >= 200)
			System.out.println("중");
		else
			System.out.println("하");
		
	}
	
	// 합계를 계산하는 메서드
	public int sum() {
		int result = kor + eng + math;
		
		System.out.println(result);
		
		return result;
	}
	
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println("-------------");
	}
	
}





