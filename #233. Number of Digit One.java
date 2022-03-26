class Solution {
    public int countDigitOne(int n) {
        
        if(n<=0)
         return 0;
        
       if(n<=9)
           return 1;
        
        HashMap<Integer , Integer> hm= new HashMap<>();
        hm.put(9 , 1);
        
        //when range is not given then we add this condition
        for(int i=9; i< (Integer.MAX_VALUE-9)/10; i= (i*10)+9)
        {
            hm.put(i*10+9 ,(hm.get(i)*10) + (i+1));
        
        }
        
        int result=0;
        
        int temp=n;
        int divisor=1;
        
        while(temp/10 != 0)
        {
            temp/=10;
            divisor*=10;
        }
        
        int rem=n%divisor;
        int fd= n/divisor;
        
        result+= hm.get(divisor-1)*fd;
        result+= (fd>1)?divisor:0;
        result+= fd==1?rem+1:0;
        result+= countDigitOne(rem);
    
        return result;
    }
}
