package xor;

public class BitwiseXor {

	public static void main(String[] args) {
		
		int a=95;
		int b=44;
		
		System.out.println("Before swapping:");
		System.out.println("a="+a +",b="+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping:");
		System.out.println("a="+a +",b="+b);
		
		

	}

}
