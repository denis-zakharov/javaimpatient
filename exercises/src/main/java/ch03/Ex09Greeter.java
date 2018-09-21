package ch03;

class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        int counter = n;
        while (counter>0) {
            System.out.println(counter + " Hello, " + target);
            counter--;
        }
    }
}

public class Ex09Greeter {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Greeter(100, "firstTarget");
        Runnable r2 = new Greeter(20, "secondTarget");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        // waiting for t1 and t2 threads termination
        // otherwise the main thread exists before t1 and t2 completed.
        t1.join();
        t2.join();

        // terminate the main thread
        System.out.println("Main thread exit.");
    }
}
