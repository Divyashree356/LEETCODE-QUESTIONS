
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
  
  
class Solution {
public:
    bool isValid(string s) {
        stack<int> st;
        char c;
        for(int i=0;i<s.length();i++){
            if(s[i]=='(' || s[i]=='['|| s[i]=='{'){
                st.push(s[i]);
            }
            else{
                if(st.empty())
                    return false;
            
               c=st.top();
               st.pop();
                if((s[i]==')'&& c=='(')|| (s[i]=='}'&& c=='{')  || (s[i]==']'&& c=='[')) 
                     continue;
                else{
                return false;
        }
            }
        }
            if(st.empty())
                return true;
            return false;
    }
};
