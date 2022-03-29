class Solution {
    String[] representation = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
         
        HashSet<String> codes= new HashSet<>();
        
        for(String s:words)
            codes.add(morseCode(s));
        
        return codes.size();
    }
    
    public String morseCode(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            ans+= representation[c-'a'];
        }
        return ans; 
    }
}
