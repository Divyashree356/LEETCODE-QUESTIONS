#EASY

//Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

//Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i , j;
        vector<int> sol;
    for(i=0; i<nums.size(); i++){
        for(j=0;j<nums.size();j++){
            if(i!=j){
        if((nums[i]+nums[j])==target){
            sol.push_back(i);
            sol.push_back(j);
            return sol;
    
            }
            }
    }
    }
        return sol;
    }
    
        
};
