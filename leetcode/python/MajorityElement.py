class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        dict = {}
        
        for num in nums:
            if num in dict:
                dict[num] += 1
            else:
                dict[num] = 1
        
        maximum = max(dict, key=lambda i: dict[i])
        
        if dict[maximum] > len(nums) / 2:
            return maximum
        
        
