Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray m) {
        // if()
        int low=1;
        int high=m.length()-1;
        int peak=-1 ,t;
        
        
        while(high>=low)
        {
            int mid =(high+low)/2;
            
            if((m.get(mid)>m.get(mid+1)) && m.get(mid)>m.get(mid-1))
            {
                peak=mid;
                 break;
            }
            
            else if(m.get(mid+1)>m.get(mid) && m.get(mid)>m.get(mid-1)){
                low=mid+1;
            }
             else if(m.get(mid-1)>m.get(mid) && m.get(mid)>m.get(mid+1)){
                high=mid-1;
            }
        }
        low=0; 
     t=peak;
        while(t>=low)
        {
            int mid=(t+low)/2;
            if(m.get(mid)==target)
            {
                return mid;
                
            }
            else if(m.get(mid)<target){
                low=mid+1;
            }
            else{
                t=mid-1;
            }
        }
         t=peak;
        high=m.length()-1;
        while(high>=t)
        {
            int mid=(t+high)/2;
            if(m.get(mid)==target)
                return  mid;
            
            
            else if(m.get(mid)<target)
                high=mid-1;
            
            else
                t=mid+1;
        }
        return -1;
     }
}
