
/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
 */
 
 public class Solution {
    public IList<int> FindDisappearedNumbers(int[] nums) 
    {
        IList<int> ret = new List<int>();
        
        for(int i=0; i<nums.Length;i++)
        {
            int x = Math.Abs(nums[i])-1;
            if(nums[x] < 0) continue;
            nums[x] = -nums[x];
        }
        
        for(int i=0; i<nums.Length;i++)
        {
            if(nums[i]>0) ret.Add(i+1);
        }
        
        return ret;
    }
}
