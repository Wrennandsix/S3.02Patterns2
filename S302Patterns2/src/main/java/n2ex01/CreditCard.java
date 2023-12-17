package n2ex01;

public class CreditCard extends PaymentGateway{
	
	private String number;

	public CreditCard(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "CreditCard [number=" + number + "]";
	}

	@Override
	public void execute() {
		
		System.out.println("Payment done with credit card by credit number: " +number);
		
	}

}
