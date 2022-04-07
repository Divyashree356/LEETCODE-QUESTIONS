class Solution {
    public int lastStoneWeight(int[] stones) {
    
      Arrays.sort(stones);
      for(int idx=stones.length-1;idx>=1;idx--)
      {
          stones[idx-1]= stones[idx]-stones[idx-1];
          Arrays.sort(stones);
      }
        return stones[0];
    }
    
}
