package multithread;

public class Mythread extends Thread{

    @Override
    public void run(){
        System.out.println("new thread start");
        int n = 0;
        while(!isInterrupted()){
            n ++;
            System.out.println(n + "name: " + this.getName() + "hello");
            if (this.getName().equals("Thread-0") && n == 100) break;
        }
    }
// 线程中断
    public static void main(String[] args) throws InterruptedException{
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t1.start();
        t1.join();
        System.out.println("one.");
        t2.start();
        t2.sleep(30);
        t2.interrupt();
        t2.join();
        System.out.println("two.");
    }

}
