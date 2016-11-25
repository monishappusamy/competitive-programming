/**
 * Created by Monish on 11/24/16.
 * Submission: 18408757
 * 
 * Sample Input:
 * 4
 * XXXXBBBBBBBBBBBBBBBBXXXXX
 * XXXBBBBBBBBBBBBBBBXXXXXXX
 * XXXXXBBBBBBBBBBBBBBBBXXXX
 * XXBBBBBBBBBBBBBBBBBXXXXXX
 * 2
 * XXXXXXXXXXXXXXXXXXXXXXXXX
 * XXXXXXXXXXXXXXXXXXXXXXXXX
 * 1
 * XXXXXXXXXBBBBBBBBBBBBBBXX
 * 0
 * 
 * Output:
 * 4
 * 0
 * 0
 */
 
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        while(Integer.parseInt(input = sc.nextLine()) != 0){
            int n = Integer.parseInt(input);
            List<Integer> countCharacters = new ArrayList<Integer>();
            for( int i = 0; i < n; i++ ){
                input = sc.nextLine();
                int count = input.length() - input.replace("X", "").length();
                countCharacters.add(count);
            }
            int max = Collections.max(countCharacters);
            int voidVariable = 0;
            for (int count: countCharacters) {
                voidVariable = voidVariable + max - count;
            }
            System.out.println(voidVariable);
        }
        sc.close();
    }
}
