/* 
Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc",
which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1
*/


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[127];
		Arrays.fill(arr, 0);
		char[] charArray = s.toCharArray();
		int counter = 0;
		int max = 0;
		for(int i=0; i<charArray.length; i++){
			for (int j=i; j<charArray.length; j++){
				if (arr[(int)charArray[j]] == 1){
					Arrays.fill(arr, 0);
					if (counter > max) 
					    max = counter;
					counter = 0;
					break;
				}
				else{
					counter++;
					arr[(int)charArray[j]] = 1;
				}
			}
		}
		if (counter > max)
			max = counter;
		return max;
    }
}
