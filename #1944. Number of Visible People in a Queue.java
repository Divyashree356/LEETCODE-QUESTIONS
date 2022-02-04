Example 1:

Input: heights = [10,6,8,5,11,9]
Output: [3,1,2,1,1,0]
Explanation:
Person 0 can see person 1, 2, and 4.
Person 1 can see person 2.
Person 2 can see person 3 and 4.
Person 3 can see person 4.
Person 4 can see person 5.
Person 5 can see no one since nobody is to the right of them.

Example 2:

Input: heights = [5,1,2,3,10]
Output: [4,1,1,1,0]


class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> st= new Stack<>();
        
        for(int i=n-1;i>=0 ;i--)
        {
            while (!st.empty() && heights[i]>st.peek())
            {
                ans[i]++;
                st.pop();
            }
            if(!st.empty())
            {
                ans[i]++;
            }
            st.push(heights[i]);
        }
        return ans;
    }
}
