package synchronizationTransientVolatile;

class Counter {

    transient int  num;
    volatile int  nums;

    public synchronized void increase() {
        num++;
    }
}

public class SyMain {

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++) {
                    counter.increase();
                }
            }
        });



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++) {
                    counter.increase();
                }
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();


        System.out.println(counter.num);
    }

}
