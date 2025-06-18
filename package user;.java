package user;

public class User {
	
	String username;
	String email;
		
 class Admin extends User{
	int adminLevel;
	
		
	}
		 
        public void show() {
        	System.out.println("adminLevel:");
        	System.out.println("username:"+username);
        	System.out.println("email:"+email);

        }
class main{        
	public static void main(String[] args) {
		
		User u1=new User();
		u1.show();
        
	}

 }
	}


