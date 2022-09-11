package test;

import java.util.Scanner;

public class alejandroII {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if((a.contains("Alejandro")&& a.contains("project"))) {
        	System.out.println("read this mail");
        }else {
        	System.out.println("don't read");
        }

	}

}
