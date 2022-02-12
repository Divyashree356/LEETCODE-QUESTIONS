Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]

//boyer moore voting algo

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int num1=-1 ,  num2=-1 , c1=0 , c2=0 ;
        
        for(int ele:nums)
        {
            if(ele==num1) 
                c1++;
            else if(ele==num2)
                c2++;
            else if(c1==0)
            { num1=ele;
                 c1=1;}
            else if(c2==0)
            {
                num2=ele;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
                
        }
        List<Integer> arr= new ArrayList<>();
        c1=0;
        c2=0;
         for(int ele:nums)
         {
            if(num1==ele)
                c1++;
             
             else if(num2==ele)
                 c2++;
         }
        if(c1>n/3)
            arr.add(num1);
        
        if(c2>n/3)
            arr.add(num2);
        
        return arr;
    }
}
