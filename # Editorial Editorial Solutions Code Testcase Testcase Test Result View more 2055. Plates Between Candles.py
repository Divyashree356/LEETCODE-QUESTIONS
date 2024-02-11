class Solution:
    def platesBetweenCandles(self, s: str, queries: List[List[int]]) -> List[int]:
        n = len(s)
        plateSum, candelLR, candelRL = [0]*n , [0]*n , [0]*n

        ans = []*len(queries)
        print("ans",ans)

        plateSum[0] = 0 + (s[0] == '*')

        for i in range(1, n):
            plateSum[i] = plateSum[i-1] + 1 if  s[i] == '*' else plateSum[i-1]

        print("plateSum", plateSum)
        candelLR[0] = 0 if (s[0] == '|') else -1
        for i in range(1,n):
            candelLR[i] = i if (s[i] == '|') else candelLR[i-1]
        
        print("candelLR",candelLR)
        candelRL[n-1] = n-1 if (s[n-1] == '|') else -1 
        for i in range(n-2, -1, -1):
            candelRL[i] = i if (s[i] == '|') else candelRL[i+1]
        
        print("candelRL", candelRL)
        for q in queries:
            left, right= candelRL[q[0]], candelLR[q[1]]
            if left == -1 or right == -1 or left >= right:
                ans.append(0)
            else:
                print("reaching",plateSum[right]- plateSum[left])
                ans.append(plateSum[right]- plateSum[left])
        return ans         
