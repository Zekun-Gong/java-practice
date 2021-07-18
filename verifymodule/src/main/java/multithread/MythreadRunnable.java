package multithread;

public class MythreadRunnable {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new MyRunnable());
        System.out.println("thread start");
        t.start(); // 启动新线程
        t.join();
        System.out.println("main end");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
