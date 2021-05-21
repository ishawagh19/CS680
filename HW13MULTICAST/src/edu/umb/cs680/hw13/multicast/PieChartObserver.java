package edu.umb.cs680.hw13.multicast;

public class PieChartObserver implements DJIAQuoteObserver, StockQuoteObserver{

	

	@Override
	public void updateDJIA(DJIAEvent eventDjia) {
		// TODO Auto-generated method stub
		DJIAEvent event = (DJIAEvent) eventDjia;
		System.out.print("PieChart of DJIAEvent: Shown here " + event.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent eventStock) {
		// TODO Auto-generated method stub
		StockEvent event = (StockEvent) eventStock;
		System.out.print("PieChart of StockEvent:Shown here " + event.getTicker() + " " + event.getQuote());
		
	}
	
	

}