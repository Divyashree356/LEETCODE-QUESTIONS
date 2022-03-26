class Solution {
    
     private final String[] lessThan10 = {"" , "One" , "Two" ,"Three" ,"Four" ,"Five" ,"Six" ,"Seven" ,"Eight" ,"Nine"};
    
    private final String[] lessThan100= {" ","Ten" , "Twenty","Thirty" ,"Forty" ,"Fifty" ,"Sixty" ,"Seventy" ,"Eighty" ,"Ninety"};
    
    private final String[] lessThan20 = {"Ten","Eleven" ,"Twelve" ,"Thirteen","Fourteen" ,"Fifteen" ,"Sixteen" ,"Seventeen" ,"Eighteen", "Nineteen"};
        
    public String numberToWords(int num) {
        if(num==0)
            return "Zero";
        
        return toWords(num);
    }
    
    public String toWords(int num)
    {
        
        String result ="";
        
        if(num<10)
            result+= lessThan10[num];
        else if(num<20)
            result+= lessThan20[num-10];
        else if(num<100)
            result+= lessThan100[num/10] + " " + toWords(num%10);
        else if(num<1000)
            result+= toWords(num/100)+ " Hundred " +toWords(num%100);
        else if(num<1000000)
            result+= toWords(num/1000) + " Thousand " + toWords(num%1000);
        else if(num<1000000000)
            result+= toWords(num/1000000) + " Million " + toWords(num%1000000);
        else
            result+= toWords(num/1000000000) + " Billion " + toWords(num%1000000000);
          
        return result.trim();
    }
}
