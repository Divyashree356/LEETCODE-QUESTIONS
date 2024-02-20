class Solution:
    def numberOfArrays(self, differences: List[int], lower: int, upper: int) -> int:
        maxDiff , minDiff= 0, 0
        tempSum = 0  
        for d in differences:
            tempSum += d 
            print(tempSum)
            maxDiff = max(tempSum, maxDiff)
            minDiff = min(tempSum, minDiff)
        print(maxDiff, minDiff)  
        print((upper-maxDiff)+(minDiff-lower)+1)
        return max(0, (upper-maxDiff)+(minDiff-lower)+1)
