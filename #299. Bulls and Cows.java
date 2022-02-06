Example 1:

Input: secret = "1807", guess = "7810"
Output: "1A3B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1807"
  |
"7810"
Example 2:

Input: secret = "1123", guess = "0111"
Output: "1A1B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1123"        "1123"
  |      or     |
"0111"        "0111"
Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
  
  class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] sec=new int [10];
        int[] gue=new int [10];
        
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
                bull++;
            
            else
            {
                sec[secret.charAt(i)-'0']++;
                gue[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++)
        {
            cow+=Math.min(sec[i],gue[i]);
        }
        String str1=Integer.toString(bull);
        String str2=Integer.toString(cow);
        
        return str1+"A"+str2+"B";
        
    }
}
