package n2ex01;

public class ShoeStore  {
	
	String name;

	public ShoeStore(String name) {
		
		this.name = name;
	}
	public void sell(PaymentGateway paymentGateway,int amount)
	{
	paymentGateway.makePayment(() -> System.out.println("at the store: "+name+", an amount of: "+amount+" $"));
	}
	
}
