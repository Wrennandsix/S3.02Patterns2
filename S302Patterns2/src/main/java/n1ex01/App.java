package n1ex01;

public class App 
{
    public static void main(String[] args) {

		StockAgent stockAgent = new StockAgent();

		stockAgent.addAgency(new StockAgencies());
		stockAgent.setStockValue(5.4f);
        stockAgent.setStockValue(4.2f);
        stockAgent.setStockValue(4.7f);
        stockAgent.setStockValue(6.9f);
	}
}
