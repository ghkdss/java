package 컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, CafeMenu> menu = new HashMap<>();
		
		menu.put("아메리카노", new CafeMenu("아메리카노", 2000, "커피"));
		menu.put("딸기쥬스", new CafeMenu("딸기쥬스", 4000, "쥬스"));
		menu.put("망고스무디", new CafeMenu("망고스무디", 4500, "스무디"));
		
		while(true) {
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 메뉴 삭제");
			System.out.println("4. 메뉴 수정");
			System.out.print("입력 : ");
			int select = sc.nextInt();
			
			switch( select ) {
			case 1:
				System.out.println("=== 전체 메뉴 ===");
				
				for( String key : menu.keySet() ) {
					System.out.println("메뉴명 : " + menu.get(key).name);
					System.out.println("가격 : " + menu.get(key).price);
					System.out.println("종류 : " + menu.get(key).category);
					System.out.println("=============================");
				}
				break;
			case 2:
				System.out.print("추가할 메뉴명 입력 : ");
				String name = sc.next();
				
				if( menu.containsKey(name) ) {
					System.out.println("이미 존재하는 메뉴!");
					break;
				}
				
				System.out.print("가격 : ");
				int price = sc.nextInt();
				System.out.print("종류 : ");
				String category = sc.next();
				
				menu.put(name, new CafeMenu(name, price, category));
				break;			
				
			case 3:
				System.out.print("삭제할 메뉴명 입력 : ");
				name = sc.next();
				
				if(!menu.containsKey(name)) {
					System.out.println("해당 메뉴가 없음");
					break;
				}
				
				menu.remove(name);
				System.out.println("삭제 완료!");
				break;
			case 4:
				System.out.print("수정할 메뉴명 입력 : ");
				name = sc.next();
				
				if(!menu.containsKey(name)) {
					System.out.println("없다");
					break;
				}
				
				System.out.print("수정할 가격 : ");
				price = sc.nextInt();
				System.out.print("수정할 종류 : ");
				category = sc.next();
				
//				menu.get(name).price = price;
//				menu.get(name).category = category;
				
				menu.put(name, new CafeMenu(name, price, category));
				break;
				
			}
			
			
			
		}
		
		
		
	}

}







