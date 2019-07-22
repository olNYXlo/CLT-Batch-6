package CustomFactoryDesign;

public class InvalidPayment implements PaymentCard {

	public static void main(String[] args) {

	}

	@Override
	public void paybills() {
		System.out.println("Invalid Option");

	}
}
