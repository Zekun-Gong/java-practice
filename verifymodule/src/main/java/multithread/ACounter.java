package multithread;

public class ACounter {
    private int count = 0;
    public synchronized void add(int n) {
            count += n;
    }
    public synchronized void dec(int n) {
            count -= n;
    }
    public int get() {
        return this.count;
    }
}
