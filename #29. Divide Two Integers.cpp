            #MEDIUM

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.

class Solution {
public:
    int divide(int dividend, int divisor) {
        if(divisor==0 || (dividend==INT_MIN && divisor==-1) )
            return INT_MAX;
        
        if( (dividend==INT_MIN && divisor==1) )
                    return INT_MIN;
                        
int sign= ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)  ) ? -1:1;

        int quotient=0;Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
        
        long absdivi= labs(dividend);
        long absdivs= labs(divisor);
        
        while(absdivi >= absdivs){
            int shift=0;
            while(absdivi >= (absdivs << shift)){
            shift++;
            }
        quotient += (1<<(shift-1));
        absdivi -= (absdivs<<(shift-1));
        }
        return sign==-1 ? (-1)*quotient:quotient;

     }
};
