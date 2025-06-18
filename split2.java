package split2;

public class Split2 {

	public static void main(String[] args) {
		String s="m,y,s,e,l,f,a,n,t,a,r,a,!";
		String[]arr=s.split(",",13);
		
		for(String a:arr)
		
		System.out.println(a);
	}

}
