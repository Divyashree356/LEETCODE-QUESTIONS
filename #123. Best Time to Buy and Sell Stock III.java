class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int[] dpl= new int[n];
        int maxSP=0;
        int minBP=price[0];
        
        for(int i=1;i<n;i++)
        {
            if(minBP > price[i])
             minBP=price[i];
             
             maxSP= price[i]-minBP;
             
             if(maxSP>dpl[i-1])
              dpl[i]=maxSP;
             else
              dpl[i]=dpl[i-1];
        }
        
        int maxBP=price[n-1];
        int maxP=0;
        int[] dpr= new int[n];
        
        for(int i=n-2;i>=0;i--)
        {
         if(maxBP<price[i])
          maxBP= price[i];
          
         maxP= maxBP-price[i];
         
         if(maxP > dpr[i+1])
          dpr[i]=maxP;
         else
          dpr[i]=dpr[i+1];
        }
        
        int profit=0;
        for(int i=0;i<n;i++)
          profit= Math.max(profit , dpr[i]+dpl[i]);
        
        return profit;

    }
}
