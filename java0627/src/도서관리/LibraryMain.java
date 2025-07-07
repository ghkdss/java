package 도서관리;

import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		Library gangnam = new Library("강남지점", "123-4567", 10);
		Library gangdong = new Library("강동지점", "456-1234", 20);
		
		Library[] gyobo = {gangnam, gangdong};
		
		while(true) {
			System.out.println("교보문고 통합 관리 시스템");
			System.out.println("지점 목록");
			System.out.println("1. 강남지점");
			System.out.println("2. 강동지점");
			System.out.println("0. 종료");
			num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			num =num-1;
			
			System.out.println("=== " + gyobo[num].name + " 도서관리 프로그램 ===");
			while(true) {
				System.out.println("1. 도서 추가");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 도서 판매");
				System.out.println("6. 판매 목록 조회");
				System.out.println("7. 종료");
				System.out.print("메뉴를 입력하세요 : ");
				int menu = sc.nextInt();
				
				if(menu == 1) {
					System.out.print("도서명 : ");
					String title = sc.next();
					System.out.print("저자 : ");
					String author = sc.next();
					System.out.print("출판사 : ");
					String publisher = sc.next();
					System.out.print("가격 : ");
					int price = sc.nextInt();
					System.out.print("재고 : ");
					int stock = sc.nextInt();
					
					Book book = new Book(title, author, publisher, price, stock);
					
					gyobo[num].addBook(book);
				} else if(menu == 2) {
					gyobo[num].searchAll();
				} else if(menu == 3) {
					System.out.print("검색어 입력 : ");
					String searchWord = sc.next();
					
					gyobo[num].searchBook(searchWord);
				} else if(menu == 4) {
					System.out.print("삭제할 도서명 입력 : ");
					String name = sc.next();
					
					gyobo[num].deleteBook(name);				
				} else if(menu == 5) {
					System.out.print("판매할 도서명 입력 : ");
					String name = sc.next();
					
					gyobo[num].sellBook(name);
				} else if(menu == 6) {
					gyobo[num].printSellBook();
				} else if(menu == 7) {
					break;
				}
				
			}
			
		}
		
		
		
	}
}







