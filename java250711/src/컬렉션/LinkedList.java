package 컬렉션;

public class LinkedList {

	public static void main(String[] args) {
		
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("Start");
		list.add("End");
		
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);

	}

}
