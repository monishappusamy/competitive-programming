/**
* Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
* Best solution:
* int addDigits(int num) {
*       return 1 + (num - 1) % 9;
*    }
*/

public class Solution {
    public int addDigits(int num) {
        int i = 0;
        while(num != 0){
            i = i + num % 10;
            num = num / 10;
        }
        if(i > 9){
            i = addDigits(i);
        }
        return i;
    }
}
