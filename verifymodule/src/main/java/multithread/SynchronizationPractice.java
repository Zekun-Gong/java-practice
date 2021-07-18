package multithread;

public class SynchronizationPractice {
    public static void main(String[] args) throws Exception {
        var add = new AddThread();
        var dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (Counter.lock) {  //获取锁
                Counter.count += 1;
            }   //释放`锁
        }
        System.out.println("finishd add");
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
        System.out.println("finished dec");
    }
}
