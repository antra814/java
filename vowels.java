package vowel;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		System.out.println("enter the number");
		int vowel=sn.nextInt();
		
		switch(vowel) {
		case 1:
			System.out.println("a");
		break;
		
		case 2:
			System.out.println("e");
		break;
		
		case 3:
			System.out.println("i");
		break;
		
		case 4:
			System.out.println("o");
		break;
		
		case 5:
			System.out.println("u");
		break;
		
		default:
			System.out.println("consonant");
			
		}
		}

	}


