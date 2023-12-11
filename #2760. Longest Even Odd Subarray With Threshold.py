class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        if len(nums) == 0 or (len(nums) == 1 and nums[0] % 2 != 0):
            return 0
        
        current_max = 0
        max_so_far = 0 

        for i in range(len(nums)):
            if nums[i] % 2 == 0 and nums[i] <= threshold:
                current_max +=1
                # print("printing i ", i)
                for j in range (i+1,len(nums)):
                    if nums[j] % 2 != nums[j-1] % 2 and nums[j] <= threshold: 
                        current_max +=1
                        # print("printing j and cm ", j, current_max)
                    else: 
                        break
                    
            max_so_far = max(max_so_far,current_max)
            current_max=0

        return max_so_far
