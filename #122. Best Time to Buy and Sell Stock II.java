class Solution {
    public int maxProfit(int[] arr) {
//         int buyD= 0;
//         int sellD=0;
        int profit=0;
        
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i] >= arr[i-1])
//               sellD++;
//             else
//             {
//                 profit+= arr[sellD]- arr[buyD];
//                 sellD = buyD =i;
//             }
//         }
//         if(profit==0 && arr[sellD]>arr[buyD])
//              profit+= arr[sellD]- arr[buyD];
            
//         return profit;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
                profit+= (arr[i]-arr[i-1]);
        }
        return profit;
    }
}
