            #EASY


Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

class Solution {
public:
    int maxProfit(vector<int>& arr) {
      int n=arr.size();
        
            if(n<=1)
                return 0;
        
        int maxP=0;
        int minEle=arr[0];
        
        for(int i=1;i<n;i++)
        {
            maxP=max(maxP , arr[i]-minEle);
            minEle=min(minEle , arr[i]);
        }
        return maxP;
        
    }
};
