package constructorconcepts;

public class Testing {

	int age;
	int salary;
	int amount;

	public Testing(int age, int salary, int amount) {
		this.age = age;
		this.salary = salary;
		this.amount = amount;
		System.out.println(age);
		System.out.println(salary);
		System.out.println(amount);
	
	}
	
	

	public static void main(String[] args) {

		Testing t1 = new Testing(30, 0, 0);

	}

}

