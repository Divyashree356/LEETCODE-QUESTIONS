class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()  
        # what is the diff between sorted and sort function python      
        # print(nums)
        closeSum = sys.maxsize
        for i in range(len(nums)):
            l = i+1
            r = len(nums) - 1 
            while (l<r):
                sum = nums[i] + nums[l] + nums[r]
                if sum == target: 
                    return sum 
                elif sum < target:
                    l += 1 
                else: 
                    r -= 1
                
                if abs(sum - target) < abs(closeSum - target):
                    closeSum = sum 

        return closeSum
