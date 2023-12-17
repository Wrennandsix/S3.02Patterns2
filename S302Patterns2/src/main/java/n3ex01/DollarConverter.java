package n3ex01;

public class DollarConverter implements CurrencyConverter {
	
	private double dollarConversion = 1.07;
	private final String CURRENCYNAME = "Dollars";

	public double getDollarConversion() {
		return dollarConversion;
	}

	public void setDollarConversion(double dollarConversion) {
		this.dollarConversion = dollarConversion;
	}

	@Override
	public double currencyConvert(double price) {
		
		return price * dollarConversion;
	}

	@Override
	public String getCurrencyName() {
		
		return CURRENCYNAME;
	}



}
