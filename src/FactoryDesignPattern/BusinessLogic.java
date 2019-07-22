package FactoryDesignPattern;

public class BusinessLogic {
	
	public static Bank myFactoryMethod(String reference) {
		if(reference.equals("dbs")) {
			return new DBSBank();
		} else if (reference.endsWith("Citi")) {
			return new CitiBank();
		}
		else
			return new OtherBank();
	}

	public static void main(String[] args) {

	}
}
