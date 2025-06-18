package movie;

public class Movie {
	String title;
	String director;
	int releaseYear;
	
	Movie(String t, String d, int r) {
		title=t;
		director=d;
		releaseYear=r;
	}

	 void show() {
		 System.out.println("Title:"+title);
		 System.out.println("Director:"+director);
		 System.out.println("ReleaseYear:"+releaseYear);
	 }
	public static void main(String[] args) {
		
		Movie m1=new Movie("king","xyz",2009);
		Movie m2=new Movie("kill","abc",2006);

	    m1.show();
	    m2.show();

	}

}
