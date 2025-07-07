package 쇼핑몰;

public class ShoppingCart {

	Product[] products;
	int productCount;
	
	ShoppingCart(int maxSize) {
		this.products = new Product[maxSize];
		this.productCount = 0;
		
		// 테스트용 데이터
		products[0] = new Product(1, "청바지", 20000, 20);
		products[1] = new Product(2, "티셔츠", 12000, 50);
		this.productCount = 2;
	}
	
	public void getAll() {
		if(productCount == 0) {
			System.out.println("장바구니가 비어있습니다.");
			return;
		}
		
		System.out.println("==== 장바구니 목록 ====");
		for(int i=0; i<productCount; i++) {
			products[i].printProduct();
		}
		
	}
	
	public void addProduct( int productId, String name, int price, int stock ) {
		int cnt = 0;
		
		for(int i=0; i<productCount; i++) {
			if(products[i].productId == productId) {
				products[i].stock += stock;
				cnt++;
				break; // 어차피 같은건 하나만 있으므로 뒤에 더 비교안해되니까 반복 종료
			} 
		}
		
		if( cnt == 0 && productCount == products.length ) {
			System.out.println("더이상 장바구니에 넣을 수 없습니다.");
			return;
		}
		
		if( cnt == 0 ) {
			products[productCount] = new Product(productId, name, price, stock);
			productCount++;
		}
		
		System.out.println("장바구니 추가 완료!");
	}
	
	public void deleteProduct(int productId) {
		// 상품이 있는 배열방 번호
		int index = -1;
		
		for(int i=0; i<productCount; i++) {
			if( products[i].productId == productId ) {
				index = i;
			}
		}
		
		if(index == -1) {
			System.out.println("해당 상품이 없습니다.");
			return;
		}
		
		for(int i=index; i<productCount-1; i++) {
			products[i] = products[i+1];
						
		}
		
		productCount--;
		
		System.out.println("삭제 완료");
		
	}
	
	public void calculateTotalPrice() {
		
		int sum = 0;
		
		for(int i=0; i<productCount; i++) {
			
			sum = sum + products[i].price * products[i].stock;
			
		}
		
		System.out.println("총 금액 : " + sum);
	}
	
	
	
}





















