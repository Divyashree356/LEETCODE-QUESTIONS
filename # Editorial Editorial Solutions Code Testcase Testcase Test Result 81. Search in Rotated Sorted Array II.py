class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        left , right = 0 , len(nums) -1

        while left <= right: 
            mid = (left + right)//2 
            if nums[mid] == target :
                return True 

            if nums[mid] == nums[left]: 
                # skipping duplicates 
                left += 1 
                continue

            if nums[left] <= nums[mid]:
                if nums[left] <= target <= nums[mid]:
                    #checking if we have a sorted subarray 
                    right -= 1
                else: 
                    left += 1
            else: 
                if nums[mid] <= target <= nums[right]:
                    left += 1
                else:
                    right -= 1   
        return False
