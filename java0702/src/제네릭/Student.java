package 제네릭;

public class Student<T> {

	String name;
	T score;
	
	public T getScore() {
		return score;
	}
	
	public void setScore(T score) {
		this.score = score;
	}
	
}
