class Solution(object):
    def generateMatrix(self, n):
        matrix = []
        if n == 0: return matrix

        for i in range(n):
            row = []
            for j in range(n):
                row.append(0)
            matrix.append(row)
        
        left = 0
        right = n-1 
        down = n-1 
        top = 0 
        num = 1

        while left <= right or top <= down:

            for i in range(left, right+1):
                matrix[top][i] = num
                num += 1
                # print(top, i , num)
            top += 1 

            for i in range(top, down + 1):
                matrix[i][right] = num 
                num += 1
                # print(i, right, num)
            right -= 1 

            for i in range(right, left -1 , -1):
                matrix[down][i] = num 
                num += 1 
                # print(down, i , num)
            down -= 1

            for i in range(down, top -1, -1):
                matrix[i][left] = num
                num += 1
                # print(i, left, num)
            left +=1

        return matrix

