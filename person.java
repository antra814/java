package person;

public class Person {
   
	String name="swara";
	int age=18;
	void show() {
	
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	}
	
	class Employee extends Person{
		int salary=90000;
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		Employee e=p.new Employee();
		e.show();
		System.out.println("salary:"+e.salary);
	
	}

}
