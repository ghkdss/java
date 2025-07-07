package 숙제들;

import java.util.Scanner;

public class 연습02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String[] menu = {"돈까스", "김밥", "라면", "냉면", "제육", "햄버거"};
		
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		
		System.out.println(menu[ num-1 ]);
		

	}

}






