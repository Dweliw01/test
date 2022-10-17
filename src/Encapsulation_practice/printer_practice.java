package Encapsulation_practice;

public class printer_practice {

	public static void main(String[] args) {
		
		//Printer HP =new Printer();
		Printer HP =new Printer(20,false);
		System.out.println(HP.getTonerLevel());
		HP.addToner(5);
		System.out.println(HP.getTonerLevel());
		System.out.println(HP.getPagesPrinted());
		HP.printPages(20);
		System.out.println(HP.getPagesPrinted());

	}

}
