package n3ex01;

public class YenConverter implements CurrencyConverter {

	private double YenConversion = 156.09;
	private final String CURRENCYNAME = "Yens";

	public String getCurrencyName() {
		return CURRENCYNAME;
	}

	public double getYenConversion() {
		return YenConversion;
	}

	public void setYenConversion(double yenConversion) {
		this.YenConversion = yenConversion;
	}

	@Override
	public double currencyConvert(double price) {
		
		return price * YenConversion;
	}

}

