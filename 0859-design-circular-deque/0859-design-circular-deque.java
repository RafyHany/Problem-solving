class MyCircularDeque {
    private int size;
    private int[] queue ;
    private int front  ;
    private int tail ;
    public MyCircularDeque(int k) {
        queue = new int[k] ;
        size = 0 ;
        front = 0 ;
        tail = k - 1;
    }
    public boolean insertFront(int value) {
        if(size == queue.length)
            return false ;
        front--;
        if(front == -1)
            front = queue.length - 1 ;
        queue[front] = value ;
        size++;
        return true;
    }
    public boolean insertLast(int value) {
        if(size == queue.length)
            return false ;
        tail++;
        if(tail == queue.length )
            tail = 0 ;
        queue[tail] = value ;
        size++;
        return true;
    }
    public boolean deleteFront() {
        if(size == 0)
            return false ;
        front++;
        if(front == queue.length )
            front = 0 ;
        size--;
        return true;
    }
    public boolean deleteLast() {
        if(size == 0)
            return false ;
        tail--;
        if(tail == -1)
            tail = queue.length - 1  ;
        size--;
        return true;
    }
    public int getFront() {
        return isEmpty() ? -1 :queue[front];
    }
    public int getRear() {
        return isEmpty() ? -1 :queue[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */