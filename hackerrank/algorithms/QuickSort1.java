package quickSort1;

import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int s = in.nextInt();
		int[] ar = new int[s];
		int[] temp_ar = new int[s];
		
		for (int i = 0; i < s; i++)
			ar[i] = in.nextInt();
		
		int i = 0, j = 0, k = 0;
		
		for (i = 1, j = ar.length-1, k=0; i < s; i++){
			if(ar[i] <= ar[0]){
				temp_ar[k] = ar[i];
				k++;
			}
			else{
				temp_ar[j] = ar[i];
				j--;
			}
		}
		if (k!=0 && j!=ar.length-1)
			temp_ar[k] = ar[0];
		else if(k==0)
			temp_ar[0] = ar[0];
		else
			temp_ar[ar.length-1] = ar[0];
		
		for (int l = 0; l < s; l++) {
			System.out.print(temp_ar[l] + " ");
		}
		
		in.close();
			
	}

}
