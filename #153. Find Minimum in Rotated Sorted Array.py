class Solution:
    def findMin(self, nums: List[int]) -> int:
        n = len(nums)
        low, high = 0, n-1
        ans = sys.maxsize
        while low <= high:
            mid = (low+high)//2
            if nums[low] <= nums[mid]:
                ans = min(nums[low], ans)
                low = mid+1 
            else :
                ans = min(nums[mid], ans)
                high = mid-1 
        return ans         
        
