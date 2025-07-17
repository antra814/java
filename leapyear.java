package leapyear;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		System.out.println("enter the year:");
		int year=sn.nextInt();
		
		if(year%4==0) {
			System.out.println("the year is leap year");
			
		}else {
			System.out.println("the year is not a leap year");
			
		}
	}
	

}
