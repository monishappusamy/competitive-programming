/**
* SUBMISSION : 17393024
*/

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Character> mirrorList = new HashMap<Character, Character>(){{
			put('A', 'A');put('E', '3');put('H', 'H');put('I', 'I');
			put('J', 'L');put('L', 'J');put('M', 'M');put('O', 'O');
			put('S', '2');put('T', 'T');put('U', 'U');put('V', 'V');
			put('W', 'W');put('X', 'X');put('Y', 'Y');put('Z', '5');
			put('1', '1');put('2', 'S');put('3', 'E');put('5', 'Z');put('8', '8');
		}};
		
		while (sc.hasNext()) {
			String str = sc.next();
			
			if(isPalindrome(str) && isMirror(str, mirrorList))
				System.out.println(str + " -- is a mirrored palindrome.\n");
			else if(isMirror(str, mirrorList))
				System.out.println(str + " -- is a mirrored string.\n");
			else if(isPalindrome(str))
				System.out.println(str + " -- is a regular palindrome.\n");
			else{
				System.out.println(str + " -- is not a palindrome.\n");
			}
		}
	    
	    sc.close();
	}
	
	static boolean isPalindrome(String str){
		char[] c = str.toCharArray();
		for(int i = 0; i < str.length() / 2; i++)
			if(c[i] != c[str.length() - i - 1])
				return false;
		return true;
	}
	
	static boolean isMirror(String str, Map<Character, Character> m){
		char[] c = str.toCharArray();
		try{
			for(int i = 0; i <= str.length() / 2; i++)
				if(c[str.length() - i - 1] != m.get(c[i]))
					return false;
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
