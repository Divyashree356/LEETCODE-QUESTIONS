Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ngr= nextGreaterRight(nums2);
        
        HashMap<Integer , Integer> hm= new HashMap<>();
        
        for(int i=0;i<nums2.length;i++)
        {
            hm.put(nums2[i], ngr[i]);
        }
        
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
    public int[] nextGreaterRight(int[] arr)
    {
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int[] ans= new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[i]>st.peek())
            {
                st.pop();
            }
            ans[i]=st.size()>0?st.peek():-1;
            st.push(arr[i]);
        }
        return ans;
        
    }
}
