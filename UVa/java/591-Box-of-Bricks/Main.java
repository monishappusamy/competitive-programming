/**
 * Created by Monish on 11/24/16.
 * 
 * Sample Input
 * 6
 * 5 2 4 1 7 5
 * 0
 * 
 * Sample Output
 * Set #1
 * The minimum number of moves is 5.
 */

import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        int counter = 0;

        while (true) {
            int n = Reader.nextInt();
            counter++;

            if (n == 0) {
                break;
            }
            else{
                List<Integer> countCharacters = new ArrayList<Integer>();
                int total = 0;
                for (int i=0; i<n; i++){
                    int k = Reader.nextInt();
                    countCharacters.add(k);
                    total += k;
                }
                int average = total / n;
                int moves = 0;
                for (int k: countCharacters){
                    if (k < average){
                        moves += average - k;
                    }
                }
                System.out.println("Set #" + counter );
                System.out.println("The minimum number of moves is " + moves + ".");
                System.out.println();
            }
        }
    }
}
