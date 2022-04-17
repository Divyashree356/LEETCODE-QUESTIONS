class Solution {
    public int largestRectangleArea(int[] arr) {
        
        int[] nsor= getNextSmallerRight(arr);
        int[] nsol= getNextSmallerLeft(arr);
        int maxArea=0;
        for(int i=0;i<arr.length;i++)
        {
            int width= nsor[i]-nsol[i]-1;
            int area= arr[i]*width;
            maxArea= Math.max(maxArea, area);
        }
        return maxArea;
    }
    
    private int[] getNextSmallerRight(int[] arr)
    {
        int[] ans= new int[arr.length];
        // Arrays.fill(arr , arr.length);
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(st.size()!=0 && arr[i]<arr[st.peek()])
            {
             int idx=st.pop();
             ans[idx]= i;
            }
            st.push(i);
        }
        while(st.size()!=0)
        {
            int idx=st.pop();
            ans[idx]= arr.length;
        }
        return ans;
    }
      private int[] getNextSmallerLeft(int[] arr)
    {
        int[] ans= new int[arr.length];
        // Arrays.fill(arr , -1);
        Stack<Integer> st= new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while( st.size()!=0 && arr[i]<arr[st.peek()])
            {
             int idx=st.pop();
             ans[idx]= i;
            }
            st.push(i);
        }
        while(st.size()!=0)
        {
            int idx=st.pop();
            ans[idx]= -1;
        }
        return ans;
    }
    
}
