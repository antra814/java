package car;

public class Car {
	String name="audi";
	String color="black";
	
	public void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("color:"+color);
		
		
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.displayInfo();

	}

}
