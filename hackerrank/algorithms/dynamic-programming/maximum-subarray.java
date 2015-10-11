import java.util.Scanner;

/**
 * Given an array A={a1,a2,…,aN} of N elements, find the maximum possible sum of a
 * 1. Contiguous subarray
 * 2. Non-contiguous (not necessarily contiguous) subarray.
 * 
 * Sample Input:
 * 2
 * 4
 * 1 2 3 4
 * 6
 * 2 -1 2 3 4 -5
 * 
 * Sample output:
 * 10 10
 * 10 11
 * 
 * @author Monish Kumar Appusamy
 *
 */

public class subarray {

	public static void main(String[] args) {
		int arr[], max_element = 0, max_ending_here = 0, max_so_far = 0;
				
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=0; i<T; i++){
			int N = in.nextInt();
			arr = new int[N];
			
			//receive a line of input ex. 5 4 6 -1 and store it in an array
			for(int j=0; j<N; j++)
				arr[j] = in.nextInt();
			
			//contiguous max array implementation starts....
			max_element = arr[0];
			max_so_far = 0;
			max_ending_here = 0;
		    for(int j = 0; j < arr.length; j++){
			     max_ending_here = max_ending_here + arr[j];
			     if(max_element < arr[j])
			    	 max_element = arr[j];
			     if (max_ending_here < 0)
			        max_ending_here = 0;
			     if (max_so_far < max_ending_here)
			        max_so_far = max_ending_here;
		     }
		   
		    if(max_element < 0)
				System.out.print(max_element + " ");
			else
				System.out.print(max_so_far + " ");
			
			// non-contiguous max array starts....
			max_element = arr[0];
			max_so_far = 0;
			max_ending_here = 0;
			
			for(int k = 0; k < arr.length; k++){
				if(max_element < arr[k])
					max_element = arr[k];
				if(arr[k] < 0)
					continue;
				max_ending_here = max_ending_here + arr[k];
				if (max_so_far < max_ending_here)
					max_so_far = max_ending_here;
			}
			
			if(max_element < 0)
				System.out.print(max_element);
			else
				System.out.print(max_so_far);
			
			System.out.println();
		}
		
		in.close();
	}
}
