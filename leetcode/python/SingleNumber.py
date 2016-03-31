from collections import Counter

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        c = Counter(nums)
        return c.keys()[c.values().index(1)]
        
        
