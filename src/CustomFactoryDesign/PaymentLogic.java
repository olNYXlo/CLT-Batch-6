package CustomFactoryDesign;

public class PaymentLogic {

	public static PaymentCard FactoryMethod(String ref) {
		if (ref.equals("NETS")) {
			return new CreditCard();
		} else if (ref.equals("MasterCard")) {
			return new DebitCard();
		} else if (ref.equals("AXIS")) {
		return new ATMCard();
		}
		else
			return new InvalidPayment();		

	}
}
