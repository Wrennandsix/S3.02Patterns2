package n2ex01;



public abstract class PaymentGateway {
	
	public void makePayment(Callback callback) {
		execute();
		callback.call();
	}
	public abstract void execute();

}
