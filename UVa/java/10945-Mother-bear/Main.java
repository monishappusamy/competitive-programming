/**
* Submission: 17397495
*/


import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(!(input = sc.nextLine()).equals("DONE")){
			if (isPalindrome(input.replaceAll("[^\\w]","").toLowerCase()))
				System.out.println("You won't be eaten!");
			else
				System.out.println("Uh oh..");
		}
		sc.close();
	}
	
	static boolean isPalindrome(String s){
		char[] c = s.toCharArray();
		int length = s.length();
		for (int i = 0; i < length / 2; i++){
			if(c[i] != c[length - i - 1])
				return false;
		}
		return true;
	}
}
