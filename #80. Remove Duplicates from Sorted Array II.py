class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if len(nums) <= 2: 
            return len(nums)

        currentIndex = 2 
        for i in range(2,len(nums)):
            if nums[currentIndex-2] != nums[i]:
                nums[currentIndex] = nums[i]
                currentIndex += 1

        return currentIndex
