class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public void pop() {
        // if (list.size() == 0) throw new Exception("no element!");        
        // list.remove(list.get(list.size() - 1));
        list.remove(list.size() - 1);
    }
    
    public int top() {
        // if (list.size() == 0) throw new Exception("no element!");
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        // if (list.size() == 0) throw new Exception("no element!");
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            } 
        } 
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
