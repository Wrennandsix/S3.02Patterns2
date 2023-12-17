package n3ex01;

import java.util.ArrayList;

public class Stock {

	private ArrayList<Item> stock = new ArrayList<Item>();

	public void addItem(Item item) {
		stock.add(item);
	}
	public void addItem(Item item,Item item2) {
		stock.add(item);
		stock.add(item2);
	}

	public void remove(Item item) {
		stock.remove(item);
	}

	public ArrayList<Item> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Item> stock) {
		this.stock = stock;
	}

	public void showConvertedPrices(CurrencyConverter converter) {

		stock.forEach(i -> System.out.println(i.getName() + " price: " + converter.currencyConvert(i.getPrice())+" "+converter.getCurrencyName()));

	}
}
