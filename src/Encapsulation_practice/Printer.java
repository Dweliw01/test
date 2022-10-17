package Encapsulation_practice;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer() {
		
	}

	public Printer(int tonerLevel, boolean duplex) {
		if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
			this.tonerLevel = -1;
			this.duplex = duplex;
		}

	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int addToner(int tonerAmount) {

		if (tonerAmount > 0 && this.tonerLevel + tonerAmount <= 100) {

			tonerLevel += tonerAmount;
			return tonerLevel;
		} else {
			return -1;
		}

	}

	public void printPages(int pages) {

		int pagesToPrint = pages;

		if (this.duplex == true) {

			pagesToPrint= pagesToPrint/2 ;
			this.pagesPrinted=pagesToPrint;

		}
		this.pagesPrinted=pagesToPrint;
	}
	
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
	
}