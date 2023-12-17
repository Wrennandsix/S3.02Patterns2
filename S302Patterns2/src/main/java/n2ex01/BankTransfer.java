package n2ex01;

public class BankTransfer extends PaymentGateway {

	private String iban;

	public BankTransfer(String iban) {
		this.iban = iban;
	}
	

	public String getIban() {
		return iban;
	}

	@Override
	public String toString() {
		return "BankTransfer [iban=" + iban + "]";
	}

	@Override
	public void execute() {	
		System.out.println("Payment done with bank transfer by iban number: " +iban);
	}

	

}
