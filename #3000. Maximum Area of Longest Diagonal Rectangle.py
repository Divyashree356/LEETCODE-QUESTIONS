class Solution:
    def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
        area, maxLen= -1, sys.float_info.min
        for d in dimensions:
            digL =  math.sqrt(d[0]*d[0] + d[1]*d[1])
            print("printing", digL)

            if maxLen < digL or (maxLen == digL  and d[0]*d[1] > area): 
                maxLen, area = digL, d[0]*d[1]
                print("printing", maxLen, area)

        return area
