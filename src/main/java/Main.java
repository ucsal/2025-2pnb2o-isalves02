import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {
		double amount = 100.0;
		Regular regularDiscount = new Regular(amount);
		Premium premiumDiscount = new Premium(amount);
		Partner partnerDiscount = new Partner(amount);

		System.out.println("REGULAR 100 -> " + regularDiscount.calculateDiscount());
		System.out.println("PREMIUM 100 -> " + premiumDiscount.calculateDiscount());
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + partnerDiscount.calculateDiscount());
	}
}
