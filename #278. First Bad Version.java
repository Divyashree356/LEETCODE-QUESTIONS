Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lower=1;
        int high=n;
        int mid;
        while(lower<high)
        {
         mid= lower+(high-lower)/2;  //we apply this because so that time limit does not exceed
            if(isBadVersion(mid)!=true)
                lower=mid+1;
            else
                high=mid;
            
        }
        return lower;
    }
}
