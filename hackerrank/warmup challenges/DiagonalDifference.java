import java.util.Scanner;
import java.util.StringTokenizer;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\n");
        int array_size;
        array_size = in.nextInt();

        
        long array_elements[][] = new long[array_size][array_size];
        long diagonalLefttoRight=0, diagonalRighttoLeft=0, sum;
        
        String str[] = new String[101];
        
       for(int i=0; i<array_size;i++){
    	   str[i] = in.next();
    	   StringTokenizer st = new StringTokenizer(str[i], " ");
    	   int size = st.countTokens();
    	   for(int j=0; j<size ;j++){
 				array_elements[i][j] = Long.parseLong(st.nextToken());
 			}
 		}
        
        for(int k=0; k<array_size;k++)
        	diagonalLefttoRight += array_elements[k][k];

        
        for(int k=0, l=array_size-1; k<array_size;k++, l--)
        	diagonalRighttoLeft += array_elements[k][l];      
        
        sum = diagonalLefttoRight - diagonalRighttoLeft;
        
        System.out.println(Math.abs(sum));
      
        in.close();
	}

}
