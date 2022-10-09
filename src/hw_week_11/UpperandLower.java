package hw_week_11;

public class UpperandLower {

	public static void main(String[] args) {
	

		int numcount =0;
		int uppercount=0;
		int lowecount=0;
		
		
		String str="#Y'alllRock@Yoll";
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <=90) {
				uppercount++;
			}else if(str.charAt(i) >= 97 && str.charAt(i) <=122) {
				lowecount++;
			}else if(str.charAt(i) >= 48 && str.charAt(i) <=57) {
				numcount++;
			}
		}
		System.out.println("uppercase letter :"+uppercount);
		System.out.println("lowercase letter :"+lowecount);
		System.out.println("numcount :"+numcount);

	}

}
