package InsertionSortInUnsortedArray;

import java.util.Scanner;

public class InsertionSortInUnsortedArray {
	public static void insertionSortPart2(int[] ar) {

		for (int i = 1; i < ar.length; i++) {
			int current = ar[i];
			int j = i-1;

			while (j >= 0 && current < ar[j]) {
				ar[j + 1] = ar[j];
				ar[j] = current;
				j--;
			}
			printArray(ar);
		}
	}
	    
	    
	      
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
