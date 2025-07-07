package 쇼핑몰;

public class Product {

	int productId;
	String name;
	int price;
	int stock;
	
	public Product(int productId, String name, int price, int stock) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void printProduct() {
		System.out.println(productId + "\t" + name + "\t" + price + "\t" + stock);
	}
	
}




