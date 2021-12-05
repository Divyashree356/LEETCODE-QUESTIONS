#C++ CODE
	    #MEDIUM
		
		// SAMPLE CASES
		// INPUT:
		// [5,7,7,8,8,10]
		// TARGET: 8
		// [5,7,7,8,8,10]
		// TARGET: 6
		// []
		// TARGET: 0

		//OUTPUT: 
		// [3,4]
		// [-1,-1]
		//[-1 ,-1]

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
//         initializing array vector with -1  
        vector<int> result(2,-1);
        if(nums.size()==0)
            return result;
        
        int i =0; 
        int j =nums.size()-1;
        int mid;
//         left search 
        while(i<j)
        {
            mid= (i+j)/2;
            if(nums[mid]<target)
                i=mid+1;
            
            else
                j=mid;
        }
//         Not present in vector case 
        if(nums[i]!= target)
            return result;
        
        else
            result[0]=i;
        
        j=nums.size() -1;
//         right search
         while(i<j)
        {
            mid= (i+j)/2+1;
            if(nums[mid]>target)
                j=mid-1;
            
            else
                i=mid;
        }
        result[1]=j;
        return result;
    }
};
