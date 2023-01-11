package polymorphism;

public class MethodOverriding {
	
	public static void main(String[] args) {
		Role user1=new Admin();
		user1.Permissions();

		
		Role user2 = new Customer();
		user2.Permissions();
	}

}
