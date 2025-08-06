// Last updated: 8/6/2025, 11:10:30 AM
class MyStack {
    Stack<Integer> stack = new Stack<>();
    // public MyStack() {
        
    // }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */