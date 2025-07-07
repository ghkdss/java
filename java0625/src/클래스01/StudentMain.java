package 클래스01;

public class StudentMain {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 90;
		
		s2.name = "김씨";
		s2.kor = 80;
		s2.eng = 50;
		s2.math = 60;
		
		s3.name = "박씨";
		s3.kor = 10;
		s3.eng = 100;
		s3.math = 80;
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		int s1_sum = s1.sum();
		int s2_sum = s2.sum();
		int s3_sum = s3.sum();
		
		// 합계들의 평균
		double avg = (s1_sum + s2_sum + s3_sum) / 3.0;
		System.out.println("합계들의 평균 : " + avg);
		
		// 합계를 기준으로 상, 중, 하를 출력
		// 250이상이면 상, 200이상이면 중, 나머지는 하
		
		s1.printGrade( s1_sum );
		s2.printGrade( s2_sum );
		s3.printGrade( s3_sum );
		
	}
}










