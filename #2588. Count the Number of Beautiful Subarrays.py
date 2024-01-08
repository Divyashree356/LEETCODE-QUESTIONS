class Solution:
    def beautifulSubarrays(self, nums: List[int]) -> int:
        prefix = [0]
        n = len(nums)
        ans = [0]*(1<<20)
        ans[0] = 1
        op = 0 

        for i in range(n):
            val = prefix[i]^ nums[i]
            prefix.insert(i+1,val)
            ind = prefix[i+1]
            op += ans[ind]
            ans[ind] += 1

        return op
