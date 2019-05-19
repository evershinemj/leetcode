class MedianFinder {
    List<Integer> list = new ArrayList<>();
    
    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        // if (list.size() == 0) throw new Exception("no number in the list!");
        Collections.sort(list);
        if (list.size() % 2 == 1) return list.get(list.size() / 2);
        else return ((double) list.get(list.size() / 2 - 1) +
            list.get(list.size() / 2)) / 2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
