class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:

        luckynums = []
        maxNum = -1
        for i in range(len(matrix)):
            minNum = min(matrix[i])
            minIndex = matrix[i].index(minNum)

            for j in range(len(matrix)) :
                # print("pre", maxNum)
                maxNum = max(maxNum, matrix[j][minIndex])
                # print("post", maxNum)

            if minNum == maxNum:
                # print("min max", minNum, maxNum)
                luckynums.append(maxNum)
            maxNum = -1
        return luckynums
