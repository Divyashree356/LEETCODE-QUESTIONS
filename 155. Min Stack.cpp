Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

class MinStack {
    private:
    stack<int> s1;
    stack<int> s2;
    public:
    void push(int val) {
        s1.push(val);
        if(s2.empty())
        {
            s2.push(INT_MAX);
        }
         if(val<=getMin())
            s2.push(val);
    }
    
    void pop() {
        
        if(s1.top()==getMin())
            s2.pop();
        
        s1.pop();
    }
    
    int top() {
        return s1.top();
    }
    
    int getMin() {
        return s2.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
