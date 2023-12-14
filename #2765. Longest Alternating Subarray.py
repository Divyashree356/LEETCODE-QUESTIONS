class Solution:
    def alternatingSubarray(self, nums: List[int]) -> int:
        max_len= -1

        for i in range(len(nums)-1):
            if nums[i+1] - nums[i] ==1: 
                current_len = 2
                for j in range(i+2, len(nums)):
                    if len(nums) > j and nums[j] == nums[j-2]:
                        current_len +=1 
                    else: 
                        break
                max_len = max(max_len, current_len)
        return max_len 
