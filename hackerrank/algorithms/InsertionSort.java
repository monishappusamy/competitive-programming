package insertionSort;

import java.util.Scanner;

public class InsertionSort {
	public static void insertIntoSorted(int[] ar) {
        int i = ar.length - 1;
        int V = ar[i];
        i--;
        
        while(i>=0 && V < ar[i]){
            ar[i+1] = ar[i];
            i--;
            printArray(ar);
        }
        ar[i+1] = V;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }   
}