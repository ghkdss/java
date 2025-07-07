package 클래스01;

public class ExMain01 {
	public static void main(String[] args) {
//		자료형 변수명 = 초기값
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal dog2 = new Animal();
		
		cat.name = "나비";
		cat.age = 1;
		
		dog.name = "밤비";
		dog.age = 8;
		
		dog2.name = "똥개";
		dog2.age = 10;
		
		cat.showInfo();
		dog.showInfo();
		dog2.showInfo();
		
//		해당 반려동물의 나이를 사람나이로 환산하면 몇살이다를 출력 ( x5 )
		int a = cat.mulAge();
		System.out.println(a);
		
		a = dog.mulAge();
		System.out.println(a);
		
		a = dog2.mulAge();
		System.out.println(a);
		
		
	}
}









