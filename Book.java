package book;

public class Book {
	
	String title;
	String author;
	 
	Book(String t,String a) {
	title=t;
	author=a;
	}
	
	void show() {
	
	System.out.println("title:"+title);
	System.out.println("author:"+author);
	}

	public static void main(String[] args) {
		
		Book b1=new Book("wings of fire" , "a.p.j abdul kalam");
		Book b2=new Book("1984" , "george orwell");
		
		b1.show();
		b2.show();
	}
	}



