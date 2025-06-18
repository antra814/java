package student;

public class Student {
	
	String name="antara";
	int age=19;
	
		void display() {
	
	System.out.println("student name:"+name);
	System.out.println("student age:"+age);
	   
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		

	}

}
