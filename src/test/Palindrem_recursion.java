package test;

public class Palindrem_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ispal("deed"));
		
	}



	public static boolean ispal(String s) {
		if (s.isEmpty() || s.length() == 1) {
			return true;
		}
		if (s.charAt(0) != s.charAt(s.length()-1)) {
			return false;
		}
			
		
		return ispal(s.substring(1, s.length() - 1));
	}
}