package test;
import java.util.Scanner;
public class ModuleNo2LessonNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word?");
		String word = input.nextLine();
		
		System.out.println("Create a sentence below that contains the word above:");
		String sentence = input.nextLine();
		
		
		if(sentence.contains(word)) {
			System.out.println("True" );
			
		}
		else {System.out.println("False");
		
		
	}

}
}