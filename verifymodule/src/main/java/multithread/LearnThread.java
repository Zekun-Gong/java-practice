package multithread;

public class LearnThread {
    public static void main(String[] args){
        System.out.println("main start....");
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("thread run....");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {}
                System.out.println("thread end");
            }
        };
        t.start();
        //用try来模拟一个并发场景
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("main end");
    }
}
