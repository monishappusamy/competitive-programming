class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        totalProduct = reduce(lambda x, y: x*y, nums)
        a = []
        
        for i in range(0, len(nums)):
            if nums[i] == 0:
                b = [x for n,x in enumerate(nums) if n != i]
                tempTotal = reduce(lambda x, y: x*y, b)
                a.append(tempTotal)
                continue
            a.append(totalProduct / nums[i])
        return a
