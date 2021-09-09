package Day11;

import java.util.LinkedList;

public class CommercialDataProcessing implements Account {
	String fileName;
	String symbol;
	double buyAt;
	double sellAt;
	String DateAndTime;
	CommercialDataProcessing(String fileName){
		this.fileName=fileName;
	}
	
	public double valueOf() {
		return buyAt-sellAt;
	}
	
	public void buy(int number, String symbol) {
		this.buyAt=number;
		this.symbol=symbol;
	}
	public void sell(int number, String symbol) {
		this.sellAt=number;
		this.symbol=symbol;
	}
	
	public void save(String filename) {
		this.fileName=filename;
	}
	public void printReport() {
		System.out.println("FileName: "+this.fileName);
		System.out.println("Buy at: "+this.buyAt);
		System.out.println("Sell at: "+this.sellAt);
		System.out.println("Symbol: "+this.symbol);
		System.out.println("Total Value: "+this.valueOf());
	}
	public void setDateAndTime(String dat) {
		this.DateAndTime=dat;
	}

	public static void main(String[] args) {
		LinkedList<CommercialDataProcessing> list = new LinkedList<CommercialDataProcessing>();
		
	}
}



interface Account{
	double valueOf();
	void buy(int number, String symbol);
	void sell(int number, String symbol);
	void save(String filename);
	void printReport();
}