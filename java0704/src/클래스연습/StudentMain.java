package 클래스연습;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		String name = "홍길동";
		Student s2 = new Student( name, 20 );
		
		System.out.println(s.name);
		System.out.println(s.age);
		
	}
}
