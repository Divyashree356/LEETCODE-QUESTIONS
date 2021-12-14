    #EASY
  
 //Example 1:

Input: a = "11", b = "1"
Output: "100"

//Example 2:

Input: a = "1010", b = "1011"
Output: "10101"



class Solution {
public:
    string addBinary(string a, string b) {
        int i=a.size()-1 , j = b.size()-1 , c=0;
        string s="";
        while(i>=0 || j>=0 || c==1)
        {
            c+=i>=0 ? a[i]-'0':0;
            c+=j>=0 ? b[j]-'0':0;
           s= char(c%2 +'0')+s;
            c/=2;
            i--;
            j--;

        }
        return s;
    }
};
