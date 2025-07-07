package 제네릭;

class Shape { }
class Circle extends Shape { }
class Rectangle { }

class Box<T extends Shape> {
	
}

public class Main02 {
	public static void main(String[] args) {

//		Box<String> b = new Box<>();
		Box<Shape> b1 = new Box<>();
		Box<Circle> b2 = new Box<>();
//		Box<Rectangle> b3 = new Box<>();
		
	}
}





