package multithread;

public class InterruptPractice {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new mytestThread();
        t.start();
        Thread.sleep(800); //让本进程休眠一会（main）sleep方法只能让当前线程睡眠。调用某一个线程类的对象t.sleep()，睡眠的不是t，而是当前线程
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class mytestThread extends Thread{
    @Override
    public void run() {

        Thread hello = new HelloThread();
        try {
            Thread.sleep(200);  //让本进程休眠一会（mytestThread)
            hello.start();

            hello.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
