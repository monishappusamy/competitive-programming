/**
* Submission: 17397247
*/

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N-- != 0){
			long p = sc.nextLong();		
			int count = 0;
			
			do{
				p = p + reverse(p);
				count++;
			}
			while(p != reverse(p));
			
			System.out.println(count + " " + p);
			
		}
		
		sc.close();
	}
	
	static long reverse(long l){
		long res = 0;
		while (l > 0) {
			long mod = l % 10;
			l = l / 10;
			res = res * 10 + mod;
		}
		return res;
	}
}
