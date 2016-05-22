/**
* Submission: 17398570
*/

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		while(T-- != 0){
			String input = sc.nextLine();
			int hours = Integer.parseInt(input.substring(0, 2));
			int minutes = Integer.parseInt(input.substring(3, 5));
			
			do{
				if(minutes == 59){
					minutes = 0;
					hours++;
				}
				else
					minutes++;
				
				if(hours == 24)
					hours = 0;
			}
			while(!isPalindrome(hours,minutes));
			
			
			if(Integer.toString(hours).length() == 1)
				System.out.print("0" + hours);
			else
				System.out.print(hours);
			
			if(Integer.toString(minutes).length() == 1)
				System.out.println(":0" + minutes);
			else
				System.out.println(":" + minutes);
		}
		
		sc.close();
	}
	
	static boolean isPalindrome(int hours, int minutes){
		String s = null;
		
		if(Integer.toString(minutes).length() == 1)
			s = Integer.toString(Integer.parseInt(hours + "0" + minutes));
		else
			s = Integer.toString(Integer.parseInt(hours + "" + minutes));
		
		char[] c = s.toCharArray();
		int length = s.length();
		for (int i = 0; i < length / 2; i++){
			if(c[i] != c[length - i - 1])
				return false;
		}
		return true;
	}
}
