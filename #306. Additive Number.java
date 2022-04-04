class Solution {
    public boolean isAdditiveNumber(String num) {
        for(int i=1;i<num.length();i++)
        {
            for(int j=i+1;j<num.length();j++)
            {
                long n1 = parsetoLong(num.substring(0 , i));
                long n2 = parsetoLong(num.substring(i , j));
                
                if(n1==-1 || n2==-1)
                    continue;
                
                if(checkAdditive( num.substring(j) , n1 ,n2))
                    return true;
                
            }
        }
        return false;
    }
    
    private long parsetoLong(String s)
    {
        if(!s.equals("0") && s.startsWith("0"))
            return -1;
        
        long digit = 0;
        try{
            digit= Long.parseLong(s);
        }
        catch(NumberFormatException e)
        {
            return -1;
        }
        return digit;
    }
    
    private boolean checkAdditive(String s , long n1 , long n2)
    {
        if(s.length()==0)
            return true;
        
        for(int i=1;i<=s.length();i++)
        {
            
        long n3= parsetoLong(s.substring(0 , i));
        if(n3==-1)
            continue;
        
        if( n2+n1 == n3 && checkAdditive( s.substring(i) , n2 , n3) )
            return true;
        }
        return false;
    }
    
}


// class Solution {
//     private boolean checkAdditive(long n1 ,  long n2 , String s, boolean check)
//     {
//         if(s.length()==0 && check)
//             return true;
        
//         String n3 = String.valueOf(n1+n2);
//         int minLen = Math.min(n3.length() , s.length());
//         if(s.substring(0, minLen).equals(n3))
//             checkAdditive(n2 , Long.parseLong(n3) ,s.substring(minLen) , true);
//         return false;
//     }
//     public boolean isAdditiveNumber(String num) {
         
//         for(int i=1;i<num.length();i++)
//         {
//              long n1= Long.parseLong(num.substring(0 , i));
//             if(!String.valueOf(n1).equals(num.substring(0 , i)))
//             {
//                 break;}
//             for(int j=i+1; j<num.length();j++)
//             {
//                 // String ex=num.substring(i , j-i);
//                 long n2= Long.parseLong(num.substring(i, j-i));
//                 if(!String.valueOf(n2).equals(num.substring(i ,j-i)))
//                     break;
                
//                 boolean isAdditive= checkAdditive(n1 , n2 , num.substring(j) , false);
                
//                 if(isAdditive)
//                     return true;
//             }
//         }
//         return false;
//     }
// }
