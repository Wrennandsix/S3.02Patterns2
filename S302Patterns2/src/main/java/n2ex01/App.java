package n2ex01;

public class App {

	public static void main(String[] args) {
		ShoeStore store = new ShoeStore("Zapatillas Pepe");
		
		PaymentGateway creditCard = new CreditCard("6454 4542 5667 5698");
		PaymentGateway iban = new BankTransfer("ES21 4253 5323 32 4267987975");
		PaymentGateway paypal = new Paypal("Juan");
			
		store.sell(iban, 55);
		store.sell(creditCard, 67);
		store.sell(paypal, 69);  
	}
}
