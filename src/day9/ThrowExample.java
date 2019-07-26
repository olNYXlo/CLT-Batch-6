package day9;




class User extends Throwable{
	public User(String ref) {
		System.out.println(ref);
	}
	
	
	static void validateAge(int age) {
		
		if(age<18) {
			User refUser = new User("Age can't be less than 18.");
			try{
				throw refUser;
			}
			catch (User e) {
				//System.out.println("Age can't be less than 18.");
				System.out.println("Exception caught..");
				
			}
			finally {
				System.out.println(""); // runs regardless of it have error or not
				
			}
		}
		
	}
}
public class ThrowExample {

	public static void main(String[] args) {
		User.validateAge(10);

	}
}