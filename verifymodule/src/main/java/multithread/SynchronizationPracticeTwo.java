package multithread;

public class SynchronizationPracticeTwo {
    public static void main(String[] args) throws Exception {
        var c1 = new ACounter();
        var c2 = new ACounter();
        var add = new Thread(()->{
            c1.add(1);
            System.out.println("finish add1");
        });
        var dec2 = new TAddThread();
        var add2 = new TDecThread();
        Thread.sleep(1000);
        add.start();
        add2.run(c2);
        dec2.run(c2);
//        add2.join();
//        dec2.join();
        System.out.println(c1.get());
        System.out.println(c2.get());
    }
}



class TAddThread extends Thread {
    public void run(ACounter c1) {
        for (int i=0; i<10000; i++) {
            c1.add(1);
        }
        System.out.println("finishd add");

    }
}

class TDecThread extends Thread {
    public void run(ACounter c1) {
        for (int i=0; i<10000; i++) {
            c1.dec(1);
        }
        System.out.println("finishd dec");
    }
}
