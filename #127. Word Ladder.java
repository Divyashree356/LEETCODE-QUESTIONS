class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> dict= new HashSet<>();
        boolean endPresent= false;
        
        for(String s: wordList)
        {
            if(endWord.equals(s) == true)
                endPresent=true;
            dict.add(s);
        }
        
        if(endPresent == false)
        {  return 0;}
        
        Queue<String> q= new LinkedList<>();
        q.add(beginWord);
        int depth=0;
        System.out.println("running");
        while(!q.isEmpty())
        {
          int dsize = q.size();
          depth++;
            while(dsize-->0)
            {
              String current= q.peek();
              q.remove();
             for(int i=0;i<current.length();i++)
             {
                char[] temp=current.toCharArray();
                 for(char c ='a';c <= 'z';c++)
                 {
                    temp[i]= c;
                     String newS = new String(temp);
                    if(current.equals(newS)==true)
                        continue;
                    if(current.equals(endWord)==true)
                        return depth;
                    if(dict.contains(newS))
                    {
                      q.add(newS);
                      dict.remove(newS);
                    }
                 }
             }
              
            } 
         
        }
        return 0;
    }
}
