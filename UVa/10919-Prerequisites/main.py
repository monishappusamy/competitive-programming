import java.io.PrintWriter;
import java.util.Scanner;

class SetTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    PrintWriter out = new PrintWriter(System.out);
	    
	    while (sc.hasNextLine()) {
	    	int k = Integer.parseInt(sc.next());
	    	if (k == 0)
	    		break;
	    	
	    	int m = Integer.parseInt(sc.next());
	    	
	    	int[] sub = new int[k];
	    	
	    	for(int i=0; i<k; i++){
	    		sub[i] = Integer.parseInt(sc.next());
	    	}
	    	
	    	boolean flag = true;
	    	
	    	for(int j=0; j<m; j++){
	    		int c = Integer.parseInt(sc.next());
	    		int r = Integer.parseInt(sc.next());
	    		int count = 0;
	    		for(int l=0; l<c; l++){
	    			 if(contains(sub, Integer.parseInt(sc.next()))){
	    				 count++;
	    			 }
	    		}
	    		if(count>=r && flag != false){
	    			flag = true;
	    		}
	    		else{
	    			flag = false;
	    		}
	    	}
	    	
	    	if(flag){
	    		out.println("yes");
	    	}
	    	else{
	    		out.println("no");
	    	}
	    }

	    out.close();
	    sc.close();
	}
	
	static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
}
