package n1ex01;

import java.util.HashSet;
import java.util.Set;

public class StockAgent {

	    private Set<StockAgency> agencies = new HashSet<StockAgency>();
	    private float stockValue;


	    public double getStockValue(){
	        return stockValue;
	    }
	    public void setStockValue(float stockValue){
	        this.stockValue = stockValue;
	        notifyAllAgencies();
	    }
	    public void addAgency(StockAgency agency){
	        agencies.add(agency);
	    }
	    public void notifyAllAgencies(){
	        for (StockAgency agency : agencies){
	            agency.update(stockValue);
	        }
	    }
	}
