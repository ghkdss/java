package 쇼핑몰;

import java.util.Scanner;

public class Shoppingmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 쇼핑몰에서 판매중인 상품 목록
		Product[] products = {
			new Product(1, "청바지", 20000, 30),
			new Product(2, "티셔츠", 12000, 80),
			new Product(3, "모자", 15000, 100)
		};
		
		ShoppingCart cart = new ShoppingCart(10);
		
		while(true) {
			System.out.println("==========================");
			System.out.println("0. 판매상품보기");
			System.out.println("1. 장바구니 전체 조회");
			System.out.println("2. 장바구니에 상품 추가");
			System.out.println("3. 장바구니 상품 삭제");
			System.out.println("4. 총금액 출력");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				System.out.println("=== 쇼핑몰에서 판매중인 상품목록 ===");
				for(Product p : products) {
					p.printProduct();
				}
				break;
			case 1:
				cart.getAll();
				break;
			case 2:
				System.out.print("장바구니에 추가할 상품번호를 입력 : ");
				int productId = sc.nextInt();
				System.out.print("구매하실 수량을 입력 : ");
				int stock = sc.nextInt();
				
				cart.addProduct( 
							productId, products[productId-1].name, 
							products[productId-1].price, stock
						);
				break;
				
			case 3:
				System.out.print("삭제할 상품번호 입력 : ");
				productId = sc.nextInt();
				
				cart.deleteProduct(productId);
				break;
				
			case 4:
				cart.calculateTotalPrice();
				return;
			}
			
		}
		
		
		
	}
}




