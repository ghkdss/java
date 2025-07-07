package 문제3;

public class EmployeeManagement {
	public static void calcSalary(Employee[] person) {
		for(Employee p : person) {
			int bonus = p.calculateBonus();
			p.salary += bonus;
		}
	}
	
	public static int calc(int salary) {
		return (int) (salary * 0.25);
	}
	
	public static void main(String[] args) {
		Employee[] person = {
				new Manager("John", 5000),
				new Engineer("Emily", 3000),
				new Manager("David", 2000),
				new Salesperson("Sarah", 4000)		
		};
		
		calcSalary(person);
		
		for(Employee p : person) {
			int bonus = calc(p.salary);
			p.salary += bonus;
		}
		
		
		
	}
}
// Q. 전체적인 메인코드 확인필요