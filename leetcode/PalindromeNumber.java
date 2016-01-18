/* Determine whether an integer is a palindrome. Do this without extra space. */

public class Solution {
    public boolean isPalindrome(int x) {
      String temp = Integer.toString(x);
  		int[] numberArr = new int[temp.length()];
  		for (int i = 0; i < temp.length(); i++)
  		    numberArr[i] = temp.charAt(i) - '0';
  		boolean flag = true;
  		for(int i=0, j=temp.length()-1; i<temp.length() && j>=0; i++, j--){
  			if (numberArr[i] != numberArr[j])
  				flag = false;
  		}
  		if(flag == false)
  		    return false;
  		return true;
    }
}
