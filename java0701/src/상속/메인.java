package 상속;

public class 메인 {
	public static void main(String[] args) {
//		하이마트 시스템 - 전자제품판매
		
		전자제품[] 판매상품들 = {
				new 에어콘(),
				new 에어콘(),
				new 티비(10, 5),
				new 냉장고(),
				new 에어콘()
		};
		
		for( 전자제품 제품 : 판매상품들 ) {
			
			if(제품 instanceof 티비) {
				티비 tv = (티비) 제품;
				tv.changeChannel();
				
			} else if(제품 instanceof 냉장고) {
				냉장고 냉 = (냉장고) 제품;
				냉.setTemp();
			} else if(제품 instanceof 에어콘) {
				에어콘 a = (에어콘) 제품;
				a.setMode();
			}
			
			
		}
		
	}
}





