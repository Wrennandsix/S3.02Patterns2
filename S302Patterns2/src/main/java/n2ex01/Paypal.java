package n2ex01;

public class Paypal extends PaymentGateway {
	
	private String user;

	
	public Paypal(String user) {
		
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "Paypal [user=" + user + "]";
	}

	@Override
	public void execute() {
	
		System.out.println("Payment done with paypal by: " +user);	
	}

}
