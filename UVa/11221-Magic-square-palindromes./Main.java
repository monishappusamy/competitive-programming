/**
* Submission: 17397973
*/

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < T; i++){
			String input = sc.nextLine().replaceAll("[^\\w]","");
			int length = input.length();
			int sqrt = (int)Math.sqrt(length);
			
			System.out.println("Case #" + (i+1) + ":");
			
			if (sqrt * sqrt != length){
				System.out.println("No magic :(");
				continue;
			}	
			else{
				if(isPalindrome(input, sqrt)){
					System.out.println(sqrt);
				}
				else{
					System.out.println("No magic :(");
				}
			}
		}
		
		sc.close();
	}
	
	static boolean isPalindrome(String input, int sqrt){
		char[][] c = new char[sqrt][sqrt];
		
		int l = 0;
		
		for(int j = 0; j < sqrt; j++){
			for(int k = 0; k < sqrt; k++){
				c[j][k] = input.charAt(l++);
			}
		}
		
		l = 0;
		
		for(int j = 0; j < sqrt; j++){
			for(int k = 0; k < sqrt; k++){
				if(c[k][j] != input.charAt(l++) || c[sqrt-k-1][sqrt-j-1] != c[k][j] || c[sqrt-j-1][sqrt-k-1] != c[k][j]){
					return false;
				}
			}
		}
		
		return true;
	}
}
