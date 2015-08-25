import java.util.Scanner;
import java.util.StringTokenizer;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\n");
		
        int N; 
        float positive =0, negative=0, zero=0;
        N = in.nextInt();
        
        String input;
        long number;
        
 	   input = in.next();
 	   StringTokenizer st = new StringTokenizer(input, " ");
 	   int size = st.countTokens();
 	   for(int j=0; j<size ;j++){
			number = Long.parseLong(st.nextToken());
			
			if (number < 0)
				negative++;
			else if (number > 0)
				positive++;
			else
				zero++;
		}
  		
 	  System.out.println(positive / size);
 	   System.out.println(negative / size);
 	   System.out.println(zero / size);
 	   
	}

}
