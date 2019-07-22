package day6;



//nested class
//a. non-static inner class

class JPMorgan{
	void adminAccess() {
		
		class AdminJPMC{
			void display() {
				System.out.println("I am in JPM Admin..");
			}
		}
		
		AdminJPMC JPMC = new AdminJPMC();
		JPMC.display();
	}
	




//b. static inner class

	static void adminAccess2() {
		
		class FinanceJPMC{
			void display2() {
				System.out.println("I am in JPM Finance..");
			}
		}
		
		FinanceJPMC FJPMC = new FinanceJPMC();
		FJPMC.display2();
	}



//c. method local inner class
	// have to create object of the class within the method itself as the inner class will be inaccessible elsewhere
	
	void accessIC() {
		class CommercialJPM{
			void display3() {
				System.out.println("I am in Commercial JPM");
			}
		}
		CommercialJPM CJPM = new CommercialJPM();
		CJPM.display3();
	}




//d. anonymous inner class






}



public class NestedClass {
	
	public static void main(String[] args) {
		
		//non static inner class. have to create object. Have to create inner class object inside the nested class
		JPMorgan JPM = new JPMorgan();
		JPM.adminAccess();
		
		//static inner class just call from class itself without creating object
		//have to create the inner class object inside the nested class
		JPMorgan.adminAccess2();
		
	}
	
	

}
