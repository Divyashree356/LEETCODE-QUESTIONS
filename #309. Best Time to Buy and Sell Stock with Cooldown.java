class Solution {
    public int maxProfit(int[] prices) {
        
        int oldBp=-prices[0];
        int oldSp=0;
        int oldCp=0;
        
        for(int i=1;i<prices.length;i++)
        {
            int newBp=0;
            int newSp=0;
            int newCp=0;
            
            if(oldCp- prices[i]> oldBp)
            {
                newBp=oldCp- prices[i]; 
            }
            else 
            {
                newBp=oldBp;
            }
            
            if(oldSp< oldBp +prices[i])
            {
                newSp=oldBp + prices[i];
            }
            else 
            {
                newSp= oldSp;
            }
            
            if(oldSp> oldCp)
            {
                newCp= oldSp;
            }
            else
            {
                newCp= oldSp;
            }
            
            oldBp= newBp;
            oldSp= newSp;
            oldCp= newCp;
        }
        return oldSp;
    }
}
