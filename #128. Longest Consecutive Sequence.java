Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
  

class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> hs= new HashSet<>();
        
        for(int num:nums)
            hs.add(num);
        
        int longestStreak= 0;
        
        for(int num:nums)
        {
            if(!hs.contains(num-1))
            {
                int currentNum= num;
                int currentStreak=1;
                
                while(hs.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                }
          longestStreak= Math.max(longestStreak , currentStreak);
            }
        }
        return longestStreak;
    }
}
