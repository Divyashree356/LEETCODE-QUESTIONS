class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        ans = []
        ansIndex = 0 
        print("length", len(nums))
        for elem in nums:
            print("index",elem)
            # ans[ansInde] =  nums[elem]
            ans.insert(ansIndex, nums[elem])
            ansIndex+=1
        return ans 
        
