class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        n = len(nums)
        maxBit = 2**maximumBit -1
        ans = []
        prefix = [nums[0]]
      
        for i in range(1,n):
            prefix.insert(i, prefix[i-1] ^ nums[i])

        for i in range(n-1, -1 ,-1):
            ans.append(prefix[i] ^ maxBit)
        
        return ans
