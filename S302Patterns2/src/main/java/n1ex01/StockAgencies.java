package n1ex01;

public class StockAgencies implements StockAgency {
	
	float stockPrice = 5;

	public void update(float stockPrice) {
		float newPrice = 0;
		if (this.stockPrice < stockPrice) {
		newPrice = stockPrice - this.stockPrice;
			System.out.println("Stonks you are winning money: +"+ newPrice+ "$" );
		}else {
			newPrice = stockPrice - this.stockPrice;
			System.out.println("Not stonks you are losing money:"+(newPrice)+ "$");
			
		}
		this.stockPrice = stockPrice;	
	}

}
