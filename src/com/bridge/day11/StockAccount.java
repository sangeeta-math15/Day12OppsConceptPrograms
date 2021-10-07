package com.bridge.day11;

/**
 * Calculate the value of each stock and the total value
 * 
 * @author Sangeeta
 * 
 */
class StockDetail {
	private String stockName;// stock name
	private Integer numOfShare;// Number of stock in stock
	private double sharePrice;// Price per product

	// Constructor
	public StockDetail(String inStockName, Integer inNumOfShare, double inSharePrice) {
		// accepts four parameters
		setStockName(inStockName);
		setNumInStock(inNumOfShare);
		setStockPrice(inSharePrice);
	}// End constructor

	private void setStockPrice(double inSharePrice) {
		this.sharePrice = inSharePrice;

	}

	public double getSharePrice() {
		return this.sharePrice;
	}

	private void setNumInStock(Integer inNumOfShare) {
		this.numOfShare = inNumOfShare;

	}

	public Integer getnumOfShare() {
		return this.numOfShare;
	}

	private void setStockName(String inStockName) {
		this.stockName = inStockName;

	}

	public String getStockName() {
		return this.stockName;
	}

	// Calculation methods
	public double CalculateStockTotalValue() // begin calculateTotalProductValue method
	{
		return getnumOfShare() * getSharePrice();
	} // end calculateTotalProductValue method

	public double CalculateTotalValue() {
		return CalculateTotalValue() * getnumOfShare();

	}
}


public class StockAccount {
	public static void main(String args[]) {

		// instantiate StockDetail array
		StockDetail st[] = new StockDetail[4];

		st[0] = new StockDetail("Parle", 23, 34.5);
		st[1] = new StockDetail("cheese", 10, 45.6);
		st[2] = new StockDetail("sauce", 20, 25.4);
		st[3] = new StockDetail("corn", 21, 30.8);

		for (StockDetail st1 : st) {
			System.out.println("The Name of the Stock==>" + st1.getStockName());
			System.out.println("The number of share ==>" + st1.getnumOfShare());
			System.out.println("The price per share ==>" + st1.getSharePrice());
			System.out.println("Total" + st1.CalculateStockTotalValue());
		}
		double total = 0.0;
		for (int i = 0; i < 4; i++) {
			total += st[i].CalculateTotalValue();
		}
		System.out.printf("Total Value  is==>", total);

	}

}
