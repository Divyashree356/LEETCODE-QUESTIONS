class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return minimumPrice(price , special , needs);
    }
    private int minimumPrice(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
       
        int sum=0;
        int len= price.size();
        
        for(int i=0;i<len;i++)
            sum+= price.get(i)*needs.get(i);
        
        for(List<Integer> l : special)
        {
            if(checkIfCorrect(needs ,l))
            {
            for(int i=0;i<len;i++)
                needs.set(i , needs.get(i)-l.get(i));
            int newSum= minimumPrice(price , special , needs);
            sum= Math.min(sum , newSum+l.get(len));
            for(int i=0;i<len;i++)
                needs.set( i ,needs.get(i)+l.get(i) );
        
        }
    }
    return sum;
            
 }
private boolean checkIfCorrect(List<Integer> needs , List<Integer> offer)
{
    for(int i=0;i<needs.size();i++)
    {
        if(needs.get(i)<offer.get(i))
            return false;
    }
    return true;
}
}
