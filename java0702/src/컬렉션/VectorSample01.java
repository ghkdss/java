package 컬렉션;

import java.util.List;
import java.util.Vector;

public class VectorSample01 {
	public static void main(String[] args) {

		List<String> list = new Vector<>();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add("내용추가" + i);
				}
			}
			
		};
		
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add("내용추가" + i);
				}
			}
			
		};
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(Exception e) {
			
		}
		
		System.out.println(list.size());
		System.out.println(list);
		
		
	}
}








