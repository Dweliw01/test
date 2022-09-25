package test;

import java.util.Scanner;

public class Shopping_list_2 {
	
	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   
		   int item_Num=1;
		   String item_Name,item_list=""; 
			String one_more_item=null;
		   double item_price,total=0;
		   
		do {
			System.out.println("Enter item"+item_Num+ " and its price:");
			item_Name=scan.next();
			item_price=scan.nextDouble();
			total+=item_price;
			
			item_list+="Item"+item_Num+": "+item_Name+" Price: "+item_price+", ";
			item_Num++;
			System.out.println("Do you want to add one more item");
			one_more_item=scan.next();
			if(one_more_item.equalsIgnoreCase("no")){
				break;
			}
						   
		   }while(item_Num<=10);
		   
		//  System.out.println(item_list.subSequence(0, item_list.length()-2));
		  System.out.println(item_list);
		  System.out.println("Total price: "+total);
	}

}

