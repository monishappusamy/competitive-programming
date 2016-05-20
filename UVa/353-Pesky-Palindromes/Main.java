/**
* SUBMISSION : 17392818
*/

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
	    while (sc.hasNext()) {	
	    	String line = sc.next();
	    	if (line == null){
	    		break;
	    	}
	    	Set<String> hs = new HashSet<String>();
			
			for(int i=0; i<line.length(); i++){
				for(int j=i; j<line.length();j++){
					String s = line.substring(i,j+1);
					int mid = s.length() / 2;
					if(s.length() % 2 == 0){
						if(s.substring(0, mid).equals(reverse(s.substring(mid, s.length())))){
							hs.add(s);
						}
					}
					else{
						if(s.substring(0, mid).equals(reverse(s.substring(mid+1, s.length())))){
							hs.add(s);
						}
					}
				}
			}
			System.out.println("The string '" + line + "' contains " + hs.size() + " palindromes.");
	    }
	    sc.close();
	}
	static String reverse(String temp){
		return new StringBuilder(temp).reverse().toString();
	}
}
