class CustomStack {

    private int[] stack;
    private int currentSize ;
    private int top ;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        currentSize = 0 ;
        top = -1 ;
    }

    public void push(int x) {
        if(currentSize == stack.length)
            return;
        stack[++top] = x ;
        currentSize ++;
    }

    public int pop() {
        if(currentSize == 0)
            return -1 ;
        currentSize--;
        return stack[top--];
        
    }

    public void increment(int k, int val) {
        int size = Math.min(k , currentSize);
        for(int i = 0 ; i < size ; ++i)
            stack[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */