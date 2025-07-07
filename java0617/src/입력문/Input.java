package 입력문;

// 코드를 다 입력했는데 import가 없으면 => ctrl + shift + o
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		sc변수에 입력기능들이 저장됨
		Scanner sc = new Scanner(System.in);
		
		int num; // 입력받은 정수를 보관할 변수
		
		System.out.print("정수를 입력해주세요 : ");
		num = sc.nextInt(); 
		
		System.out.println("입력하신 값은 : ");
		System.out.println("프로그램 종료");
		
	}
}






