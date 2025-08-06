// Last updated: 8/6/2025, 11:07:24 AM
class CustomStack {
    private int[]  stackArray;
    private int top;

    public CustomStack(int maxSize) {
        stackArray = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if (top < stackArray.length -1){
            stackArray[++top] = x;
        }
    }
    
    public int pop() {
        if (top >= 0){
            return stackArray[top--];
        }
        return -1;
        
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k,top+1); i++){
            stackArray[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */