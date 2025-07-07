package 입력문;

import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {

		String name, phone;
		int age;
		char gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);
		System.out.print("전화번호를 입력하세요 : ");
		phone = sc.next();
		
		System.out.println("=== 결과 ===");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		
	}
}







