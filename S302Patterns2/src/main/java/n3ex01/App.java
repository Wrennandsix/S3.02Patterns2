package n3ex01;

public class App {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		Item apple = new Item("apple",0.55);
		Item rocketLauncher = new Item("rocket launcher",125000.68);
		stock.addItem(rocketLauncher,apple);
		
		CurrencyConverter dollarConverter = new DollarConverter();
		CurrencyConverter yenConverter = new YenConverter();
		
		stock.showConvertedPrices(dollarConverter);
		stock.showConvertedPrices(yenConverter);		
	}
}
