class MyCircularQueue {
    private List<Integer> q;
    private int capacity;

    public MyCircularQueue(int k) {
        q = new ArrayList<>();
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (q.size() == capacity) {
            return false;
        }
        q.add(value);
        return true;
    }

    public boolean deQueue() {
        if (q.size() == 0) {
            return false;
        }
        q.remove(0);
        return true;
    }

    public int Front() {
        if (q.size() == 0) {
            return -1;
        }
        return q.get(0);
    }

    public int Rear() {
        if (q.size() == 0) {
            return -1;
        }
        return q.get(q.size() - 1);
    }

    public boolean isEmpty() {
        return q.size() == 0 ? true : false;
    }

    public boolean isFull() {
        return q.size() == capacity ? true : false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */