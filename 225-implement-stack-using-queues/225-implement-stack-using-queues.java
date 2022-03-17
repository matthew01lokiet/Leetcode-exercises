class MyStack {
    Queue<Integer> queue;
    Queue<Integer> reverseQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        
        queue = new LinkedList<>();
        reverseQueue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        reverseQueue.add(x); 
  
         
        while(!queue.isEmpty()) 
        { 
            reverseQueue.add( queue.peek() ); 
            queue.remove(); 
        } 
  
             
        Queue<Integer> queTemp = queue; 
        queue = reverseQueue; 
        reverseQueue = queTemp; 
        
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        return queue.remove();
        
    }
    
    /** Get the top element. */
    public int top() {
        
        return queue.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        return queue.isEmpty();
        
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