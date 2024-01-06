class Solution:
    def minimumCoins(self, prices: List[int]) -> int:
        n = len(prices)
        dp = [-1]*(n+1)
        #initialize whole array with -1 
        
        dp[n] = 0 
        dp[n-1] = prices[n-1]

        for i in range(n - 2, -1, -1):
            minCoins = sys.maxsize
            for j in range(i+1,min(2*i +2, n)+1):
                minCoins = min(minCoins, dp[j])

            dp[i] = minCoins + prices[i]
            
        return dp[0]
